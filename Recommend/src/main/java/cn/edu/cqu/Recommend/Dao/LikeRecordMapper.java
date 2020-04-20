package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.LikeRecord;
import cn.edu.cqu.Recommend.Pojo.LikeRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LikeRecordMapper {
	long countByExample(LikeRecordExample example);

	int deleteByExample(LikeRecordExample example);

	int deleteByPrimaryKey(Integer likeRecordId);

	int insert(LikeRecord record);

	int insertSelective(LikeRecord record);

	List<LikeRecord> selectByExample(LikeRecordExample example);

	LikeRecord selectByPrimaryKey(Integer likeRecordId);

	int updateByExampleSelective(@Param("record") LikeRecord record, @Param("example") LikeRecordExample example);

	int updateByExample(@Param("record") LikeRecord record, @Param("example") LikeRecordExample example);

	int updateByPrimaryKeySelective(LikeRecord record);

	int updateByPrimaryKey(LikeRecord record);
}