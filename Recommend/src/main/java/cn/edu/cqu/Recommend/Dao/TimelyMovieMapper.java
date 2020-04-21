package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.TimelyMovie;
import cn.edu.cqu.Recommend.Pojo.TimelyMovieExample;
import cn.edu.cqu.Recommend.Pojo.TimelyMovieWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TimelyMovieMapper {
	long countByExample(TimelyMovieExample example);

	int deleteByExample(TimelyMovieExample example);

	int insert(TimelyMovieWithBLOBs record);

	int insertSelective(TimelyMovieWithBLOBs record);

	List<TimelyMovieWithBLOBs> selectByExampleWithBLOBs(TimelyMovieExample example);

	List<TimelyMovie> selectByExample(TimelyMovieExample example);

	int updateByExampleSelective(@Param("record") TimelyMovieWithBLOBs record,
			@Param("example") TimelyMovieExample example);

	int updateByExampleWithBLOBs(@Param("record") TimelyMovieWithBLOBs record,
			@Param("example") TimelyMovieExample example);

	int updateByExample(@Param("record") TimelyMovie record, @Param("example") TimelyMovieExample example);
}