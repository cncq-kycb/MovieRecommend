package cn.edu.cqu.Recommend.Pojo;

import java.util.Date;

public class ViewRecord {
    private Integer viewRecordId;

    private Integer userId;

    private Long userTel;

    private Integer movieId;

    private Date viewRecordTime;

    public Integer getViewRecordId() {
        return viewRecordId;
    }

    public void setViewRecordId(Integer viewRecordId) {
        this.viewRecordId = viewRecordId;
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

    public Date getViewRecordTime() {
        return viewRecordTime;
    }

    public void setViewRecordTime(Date viewRecordTime) {
        this.viewRecordTime = viewRecordTime;
    }
}