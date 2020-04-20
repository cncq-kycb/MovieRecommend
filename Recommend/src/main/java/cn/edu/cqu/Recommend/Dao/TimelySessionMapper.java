package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.TimelySession;
import cn.edu.cqu.Recommend.Pojo.TimelySessionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TimelySessionMapper {
	long countByExample(TimelySessionExample example);

	int deleteByExample(TimelySessionExample example);

	int insert(TimelySession record);

	int insertSelective(TimelySession record);

	List<TimelySession> selectByExample(TimelySessionExample example);

	int updateByExampleSelective(@Param("record") TimelySession record, @Param("example") TimelySessionExample example);

	int updateByExample(@Param("record") TimelySession record, @Param("example") TimelySessionExample example);
}