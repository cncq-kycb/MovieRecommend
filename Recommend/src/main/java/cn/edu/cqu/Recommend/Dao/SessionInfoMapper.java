package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.SessionInfo;
import cn.edu.cqu.Recommend.Pojo.SessionInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SessionInfoMapper {
    long countByExample(SessionInfoExample example);

    int deleteByExample(SessionInfoExample example);

    int insert(SessionInfo record);

    int insertSelective(SessionInfo record);

    List<SessionInfo> selectByExample(SessionInfoExample example);

    int updateByExampleSelective(@Param("record") SessionInfo record, @Param("example") SessionInfoExample example);

    int updateByExample(@Param("record") SessionInfo record, @Param("example") SessionInfoExample example);
}