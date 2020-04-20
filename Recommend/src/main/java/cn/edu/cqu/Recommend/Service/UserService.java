package cn.edu.cqu.Recommend.Service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import cn.edu.cqu.Recommend.Utils.MyJson;

@Service
public interface UserService {

	// 获取用户信息
	public MyJson getUserInfo(HttpSession session);

	// 按日期条件获取电影场次信息
	public MyJson getTimelySession(Integer movieId, String condition);

	// 获取全部电影信息
	public MyJson getMovies();

	// 按条件搜索电影信息
	public MyJson searchMovie(String condition);

	// 根据电影ID获取电影信息
	public MyJson getMovieById(Integer movieId);

	// 推荐电影, 含参数为实际推荐, 不含参数为随机推荐
	public MyJson getRecommendMovies(HttpSession session);

	public MyJson getRecommendMovies();

}
