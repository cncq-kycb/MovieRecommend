# -*- coding: utf-8 -*-
import  MySQLdb

class Config:
    # host
    HOST = 'cdb-mzvws756.cd.tencentcdb.com'
    # 用户名
    USER = 'recommend'
    # 密码
    PASSWORD = 'zxc123!@#'
    # 数据库
    DATABASE = 'recommend'
    # 端口号
    PORT = 10143

class Recommend:
    def __init__(self, user_id, top_k, db):
        # 获取数据库连接
        self.db = db
        # 用户ID
        self.user_id = user_id
        # 最终结果的长度
        self.top_k = top_k
        # 用户已看过电影, 不再推荐
        self.watched_movies = []
        # 用户浏览记录所求电影种类偏好(key为movie_id, value为权重)
        self.type_prefer = {}
        # 电影种类向量维度
        # self.type_count_num = 0
        # 推荐结果
        self.recommend_result = []
        
    # 获取数据库内相关数据
    def get_view_record(self):
        cursor = self.db.cursor()
        sql = ('SELECT movie_info_data.movie_id,movie_info_data.movie_type_ids '
                'FROM movie_info_data '
	            'JOIN view_record ON view_record.movie_id = movie_info_data.movie_id '
                'AND view_record.movie_id = movie_info_data.movie_id '
                'WHERE view_record.user_id = %d' % self.user_id)
        try:
            cursor.execute(sql)
        except:
            print('Database err:'+ sql)
            return
        view_movie_list = []
        view_type_list = []
        for row in cursor.fetchall():
            view_movie_list.append(row[0])
            for type_id in row[1].split(','):
                if type_id in self.type_prefer:
                    self.type_prefer[type_id] += 1
                else:
                    self.type_prefer[type_id] = 1
        self.watched_movies = view_movie_list
        # 用户偏好电影类型权重
        # sum_count = sum(list(self.type_prefer.values()))
        # for key,value in self.type_prefer.items():
        #     self.type_prefer[key] = value / sum_count

        # cursor = db.cursor()
        # sql = 'SELECT COUNT(*) FROM movie_type'
        # try:
        #     cursor.execute(sql)
        # except:
        #     print('Database err')
        #     return
        # for row in cursor.fetchall():
        #     # 电影类型向量维度
        #     self.type_count_num = row[0]

    def recommend_start(self):
        # 获取数据库连接
        cursor = self.db.cursor()
        sql = 'SELECT movie_id,movie_type_ids FROM movie_info_data'
        try:
            cursor.execute(sql)
        except:
            print('Database err:'+ sql)
            return
        # TopK电影集合
        movies = {}
        for row in cursor.fetchall():
            movie_id = row[0]
            movie_type_ids = row[1].split(',')
            if movie_id in self.watched_movies:
                continue
            # 用户偏好打分
            score = 0
            for movie_type_id in movie_type_ids:
                if movie_type_id in self.type_prefer:
                    score += self.type_prefer[movie_type_id]
            # TopK计算
            if len(movies) < self.top_k:
                movies[movie_id] = score
            else:
                min_key = min(movies, key = lambda k:movies[k])
                if movies[min_key] < score:
                    movies.pop(min_key)
                    movies[movie_id] = score
        self.recommend_result = movies

    def save_recommend(self):
        sql = 'DELETE FROM recommend WHERE user_id = %d' % self.user_id
        cursor = self.db.cursor()
        try:
            cursor.execute(sql)
        except:
            print('Database err(DELETE)')
        for key,value in self.recommend_result.items():
            # cursor = db.cursor()
            sql = 'INSERT INTO recommend (user_id, movie_id, score) VALUES (%d, %d, %d)' % (int(self.user_id), int(key), int(value))
            try:
                cursor.execute(sql)
            except:
                print('Database err:'+ sql)
                return
        cursor.connection.commit()
        return True

class RecommendSys:
    def __init__(self, recommend_size):
        config = Config()
        self.recommend_size = recommend_size
        self.db = MySQLdb.connect(host=config.HOST, user=config.USER,password=config.PASSWORD,db=config.DATABASE,port=config.PORT, charset='utf8')
        cursor = self.db.cursor()
        self.user_ids = []
        sql = 'SELECT DISTINCT user_id FROM view_record'
        try:
            cursor.execute(sql)
        except:
            print('Database err:'+ sql)
        for row in cursor.fetchall():
            self.user_ids.append(row[0])

    def recommend_task(self):
        for user_id in self.user_ids:
            recommd = Recommend(user_id, self.recommend_size, self.db)
            recommd.get_view_record()
            recommd.recommend_start()
            if not recommd.save_recommend():
                print('Recommend_task err')
                return
        return True

import sys
if __name__ == '__main__':
    if not len(sys.argv) == 2:
        print('Command invalid(Need 1 parameters)')
        exit()
    else:
        if not sys.argv[1].isdigit():
            print('Parameter type invalid')
            exit()
    recommend_size = int(sys.argv[1])
    recommendSys = RecommendSys(recommend_size)
    if recommendSys.recommend_task():
        print('Operation Success')