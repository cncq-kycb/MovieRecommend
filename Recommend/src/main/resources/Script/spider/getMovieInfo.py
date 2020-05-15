#####33333333333##豆瓣电影爬虫1.0
#依赖：selenium,webdriver,pymysql,chrome

from selenium import webdriver
from selenium.webdriver.chrome.options import Options

import sys
import time
import pymysql
import re


def getInfo(url):

    # 进入网址
    browser.get(url)
    print('---------------------------------------------')
    print('开始爬取:'+url)
    # 数据库链接打开

    # 爬取movie表
    try:
        movieName = browser.find_element_by_xpath('/html/body/div[3]/div[1]/h1/span[1]').text
    except:
        print('无电影')
        return
 #   movieName = ''.join(re.findall('[\u4e00-\u9fa5]', movieName))
    sql = "select movie_id from movie where movie_name=%s"
    cursor.execute(sql,movieName)  # 执行sql
    movieId = cursor.fetchall()
    if len(movieId)!=0:
        print('此电影已存在！退出')
        return
#    movieScroe = browser.find_element_by_xpath('/html/body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/strong').text

    try:
        movieScroe = browser.find_element_by_xpath('/html/body/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/strong').text
    except:
        movieScroe = browser.find_element_by_xpath('/html/body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/strong').text

#    movieScroe = browser.find_element_by_class_name('ll rating_num').text
    print('name: ',movieName)
    print('score: ',movieScroe)
    try:
        movieScroe = float(movieScroe)
    except:
        movieScroe = -1
    try:
        picUrl = browser.find_element_by_xpath('/html/body/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a/img').get_attribute('src')
        #/html/body/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a
    except:
        picUrl = browser.find_element_by_xpath('//*[@id="mainpic"]/a/img').get_attribute('src')

    insert_sql = """
            insert into movie (movie_name,movie_rate,movie_image) VALUES(%s,%s,%s)
            """
    cursor.execute(insert_sql, (movieName,movieScroe,picUrl))
    connect.commit()


    # 获取电影ID
#    sql = "select movie_id from movie where movie_name="+movieName
    sql = "select movie_id from movie where movie_name=%s"
    cursor.execute(sql,movieName)  # 执行sql
    movieId = cursor.fetchall()
    movieId = movieId[0][0]
    print('movieId: ',movieId)


    # 导演
    movieDirectors = browser.find_element_by_class_name('attrs').text
    movieDirectors = re.split('[ / ]',movieDirectors)
    for i in movieDirectors:
        if i == '更多...' or i=='导演:':
            movieDirectors.remove(i)
    while '' in movieDirectors:
        movieDirectors.remove('')
    print(movieDirectors)
    for movieDirector in movieDirectors:
        # 查找导演
        sql = "select director_id from director where director_name=%s"
        cursor.execute(sql, movieDirector)  # 执行sql
        directorId = cursor.fetchall()
        # 如果不存在导演，插入
        if len(directorId) == 0:
            insert_sql = """
                        insert into director (director_name) VALUES(%s)
                        """
            cursor.execute(insert_sql, (movieDirector))
            connect.commit()
            # 获取导演id
            sql = "select director_id from director where director_name=%s"
            cursor.execute(sql, movieDirector)  # 执行sql
            directorId = cursor.fetchall()

        # 得到导演ID
        directorId = directorId[0][0]

        # 将导演ID和电影插入映射表
        insert_sql = """
                    insert into director_movie_map (director_id,movie_id) VALUES(%s,%s)
                    """
        cursor.execute(insert_sql, (directorId, movieId))
        connect.commit()
        #print('picURL: ', picUrl)

    # 演员
    try:
        movieStar = browser.find_element_by_class_name('actor').text
        movieStar = re.split('[ / ]', movieStar)
        for i in movieStar:
            if i == '更多...' or i == '主演:':
                movieStar.remove(i)
        while '' in movieStar:
            movieStar.remove('')
        print(movieStar)
        # 查找演员
        for star in movieStar:
            sql = "select actor_id from actor where actor_name=%s"
            cursor.execute(sql, star)  # 执行sql
            actorId = cursor.fetchall()
            if len(actorId) == 0:
                insert_sql = """
                            insert into actor (actor_name) VALUES(%s)
                            """
                cursor.execute(insert_sql, (star))
                connect.commit()

                sql = "select actor_id from actor where actor_name=%s"
                cursor.execute(sql, star)  # 执行sql
                actorId = cursor.fetchall()
                actorId = actorId[0][0]
            insert_sql = """
                        insert into actor_movie_map (movie_id,actor_id) VALUES(%s,%s)
                        """
            cursor.execute(insert_sql, (movieId, actorId))
            connect.commit()
    except:
        print('电影无演员')

    # 获取电影类型
    types = []
    for i in range(2,12):
        temp = browser.find_element_by_xpath('//*[@id="info"]/span['+str(i)+']').text
        if temp == '类型:':
            i = i + 1
            mtype = browser.find_element_by_xpath('//*[@id="info"]/span[' + str(i) + ']').text
            sql = "select movie_type_id from movie_type where movie_type_name=%s"
            cursor.execute(sql, mtype)  # 执行sql
            typeId = cursor.fetchall()
            while len(typeId)!=0:
                print(mtype)
                typeId = typeId[0][0]
                insert_sql = """
                                    insert into movie_type_map (movie_id,movie_type_id) VALUES(%s,%s)
                                    """
                cursor.execute(insert_sql, (movieId, typeId))
                connect.commit()
                i = i + 1
                mtype = browser.find_element_by_xpath('//*[@id="info"]/span[' + str(i) + ']').text
                sql = "select movie_type_id from movie_type where movie_type_name=%s"
                cursor.execute(sql, mtype)  # 执行sql
                typeId = cursor.fetchall()
    # 延迟两秒
    time.sleep(5)


if __name__ == '__main__':
    # 直接运行在这里输入地址
#    getURL = '26325320'
#    baseURL = 'https://movie.douban.com/subject/'
#    URL = baseURL+getURL
    # terminal传入的地址
#    try:
#        print('argv: ',sys.argv[1])
#        getURL = sys.argv[1]
#        if len(getURL)>10:
#            URL=getURL
#        else:
#            URL=baseURL+getURL
#        print('从控制台获取地址：')
#    except:
#        print('从代码中获取地址：')
#    print(URL)

    # 初始化浏览器

    browser = webdriver.Safari()
  #  browser = webdriver.Chrome()


    # 初始化数据库
    mhost = 'cdb-mzvws756.cd.tencentcdb.com'
    muser = 'recommend'
    mpassword = 'zxc123!@#'
    mport = 10143
    mdb = 'recommend'
    connect = pymysql.connect(host=mhost, user=muser, password=mpassword, db=mdb, port=mport)
    cursor = connect.cursor()
    URL = ''

    with open('log.txt','r') as f:
        for url in f:
            try:
                getInfo(url.strip('\n'))
            except:
                print('error:'+url)
            time.sleep(5)

    #
#    for i in range(1300000,27200000):
 #       URL = 'https://movie.douban.com/subject/'+str(i)
  #      try:
   #         getInfo(URL)
    #    except:
     #       with open('log.txt','a') as f:
      #          f.write(str(i)+'\n')
    # 关闭浏览器

    browser.quit()

    # 关闭链接
    cursor.close()
    connect.close()

