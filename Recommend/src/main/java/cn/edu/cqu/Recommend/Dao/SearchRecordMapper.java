package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.SearchRecord;
import cn.edu.cqu.Recommend.Pojo.SearchRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchRecordMapper {
    long countByExample(SearchRecordExample example);

    int deleteByExample(SearchRecordExample example);

    int deleteByPrimaryKey(Integer searchRecordId);

    int insert(SearchRecord record);

    int insertSelective(SearchRecord record);

    List<SearchRecord> selectByExample(SearchRecordExample example);

    SearchRecord selectByPrimaryKey(Integer searchRecordId);

    int updateByExampleSelective(@Param("record") SearchRecord record, @Param("example") SearchRecordExample example);

    int updateByExample(@Param("record") SearchRecord record, @Param("example") SearchRecordExample example);

    int updateByPrimaryKeySelective(SearchRecord record);

    int updateByPrimaryKey(SearchRecord record);
}