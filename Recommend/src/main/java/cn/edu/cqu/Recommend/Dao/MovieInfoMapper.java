package cn.edu.cqu.Recommend.Dao;

import cn.edu.cqu.Recommend.Pojo.MovieInfo;
import cn.edu.cqu.Recommend.Pojo.MovieInfoExample;
import cn.edu.cqu.Recommend.Pojo.MovieInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieInfoMapper {
    long countByExample(MovieInfoExample example);

    int deleteByExample(MovieInfoExample example);

    int insert(MovieInfoWithBLOBs record);

    int insertSelective(MovieInfoWithBLOBs record);

    List<MovieInfoWithBLOBs> selectByExampleWithBLOBs(MovieInfoExample example);

    List<MovieInfo> selectByExample(MovieInfoExample example);

    int updateByExampleSelective(@Param("record") MovieInfoWithBLOBs record, @Param("example") MovieInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") MovieInfoWithBLOBs record, @Param("example") MovieInfoExample example);

    int updateByExample(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);
}