package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.ViewRecord;
import cn.edu.cqu.Recommend.Pojo.ViewRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ViewRecordMapper {
    long countByExample(ViewRecordExample example);

    int deleteByExample(ViewRecordExample example);

    int deleteByPrimaryKey(Integer viewRecordId);

    int insert(ViewRecord record);

    int insertSelective(ViewRecord record);

    List<ViewRecord> selectByExample(ViewRecordExample example);

    ViewRecord selectByPrimaryKey(Integer viewRecordId);

    int updateByExampleSelective(@Param("record") ViewRecord record, @Param("example") ViewRecordExample example);

    int updateByExample(@Param("record") ViewRecord record, @Param("example") ViewRecordExample example);

    int updateByPrimaryKeySelective(ViewRecord record);

    int updateByPrimaryKey(ViewRecord record);
}