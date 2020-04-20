package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.Cinema;
import cn.edu.cqu.Recommend.Pojo.CinemaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CinemaMapper {
	long countByExample(CinemaExample example);

	int deleteByExample(CinemaExample example);

	int deleteByPrimaryKey(Integer cinemaId);

	int insert(Cinema record);

	int insertSelective(Cinema record);

	List<Cinema> selectByExample(CinemaExample example);

	Cinema selectByPrimaryKey(Integer cinemaId);

	int updateByExampleSelective(@Param("record") Cinema record, @Param("example") CinemaExample example);

	int updateByExample(@Param("record") Cinema record, @Param("example") CinemaExample example);

	int updateByPrimaryKeySelective(Cinema record);

	int updateByPrimaryKey(Cinema record);
}