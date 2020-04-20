package cn.edu.cqu.Recommend.Service;

import org.springframework.stereotype.Service;

import cn.edu.cqu.Recommend.Utils.MyJson;

@Service
public interface MovieService {

	// 获取全部电影信息
	public MyJson getMovies();

	// 按条件搜索电影信息
	public MyJson searchMovie(String condition);

}
