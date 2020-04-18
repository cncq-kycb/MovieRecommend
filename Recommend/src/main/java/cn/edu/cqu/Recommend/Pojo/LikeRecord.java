package cn.edu.cqu.Recommend.Pojo;

import java.util.Date;

public class LikeRecord {
    private Integer likeRecordId;

    private Integer userId;

    private Long userTel;

    private Integer movieId;

    private Date likeRecordTime;

    public Integer getLikeRecordId() {
        return likeRecordId;
    }

    public void setLikeRecordId(Integer likeRecordId) {
        this.likeRecordId = likeRecordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getUserTel() {
        return userTel;
    }

    public void setUserTel(Long userTel) {
        this.userTel = userTel;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Date getLikeRecordTime() {
        return likeRecordTime;
    }

    public void setLikeRecordTime(Date likeRecordTime) {
        this.likeRecordTime = likeRecordTime;
    }
}