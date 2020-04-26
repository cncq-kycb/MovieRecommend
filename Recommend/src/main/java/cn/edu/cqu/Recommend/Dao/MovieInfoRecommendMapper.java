package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.MovieInfoRecommend;
import cn.edu.cqu.Recommend.Pojo.MovieInfoRecommendExample;
import cn.edu.cqu.Recommend.Pojo.MovieInfoRecommendWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MovieInfoRecommendMapper {
	long countByExample(MovieInfoRecommendExample example);

	int deleteByExample(MovieInfoRecommendExample example);

	int insert(MovieInfoRecommendWithBLOBs record);

	int insertSelective(MovieInfoRecommendWithBLOBs record);

	List<MovieInfoRecommendWithBLOBs> selectByExampleWithBLOBs(MovieInfoRecommendExample example);

	List<MovieInfoRecommend> selectByExample(MovieInfoRecommendExample example);

	int updateByExampleSelective(@Param("record") MovieInfoRecommendWithBLOBs record,
			@Param("example") MovieInfoRecommendExample example);

	int updateByExampleWithBLOBs(@Param("record") MovieInfoRecommendWithBLOBs record,
			@Param("example") MovieInfoRecommendExample example);

	int updateByExample(@Param("record") MovieInfoRecommend record,
			@Param("example") MovieInfoRecommendExample example);
}