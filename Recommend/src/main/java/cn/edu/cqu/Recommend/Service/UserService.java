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

}
