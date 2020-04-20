package cn.edu.cqu.Recommend.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.cqu.Recommend.Dao.MovieInfoMapper;
import cn.edu.cqu.Recommend.Pojo.MovieInfo;
import cn.edu.cqu.Recommend.Pojo.MovieInfoExample;
import cn.edu.cqu.Recommend.Service.MovieService;
import cn.edu.cqu.Recommend.Utils.MyJson;
import cn.edu.cqu.Recommend.Utils.Static.ErrInfoStrings;

@Component
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieInfoMapper movieInfoMapper;

	@Override
	public MyJson getMovies() {
		MovieInfoExample movieInfoExample = new MovieInfoExample();
		movieInfoExample.or();
		try {
			List<MovieInfo> movieInfos = movieInfoMapper.selectByExample(movieInfoExample);
			return new MyJson(true, movieInfos);
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(false, ErrInfoStrings.DATABASE_ERR);
		}
	}

	@Override
	public MyJson searchMovie(String condition) {
		MovieInfoExample movieInfoExample = new MovieInfoExample();
		movieInfoExample.or().andMovieNameLike(condition);
		try {
			List<MovieInfo> movieInfos = movieInfoMapper.selectByExample(movieInfoExample);
			return new MyJson(true, movieInfos);
		} catch (Exception e) {
			System.err.println(e);
			return new MyJson(false, ErrInfoStrings.DATABASE_ERR);
		}
	}

}
