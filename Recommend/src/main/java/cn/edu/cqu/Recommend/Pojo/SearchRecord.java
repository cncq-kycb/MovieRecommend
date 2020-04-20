package cn.edu.cqu.Recommend.Pojo;

import java.util.Date;

public class SearchRecord {
    private Integer searchRecordId;

    private Integer userId;

    private Long userTel;

    private String searchRecordItem;

    private Date searchRecordTime;

    public Integer getSearchRecordId() {
        return searchRecordId;
    }

    public void setSearchRecordId(Integer searchRecordId) {
        this.searchRecordId = searchRecordId;
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

    public String getSearchRecordItem() {
        return searchRecordItem;
    }

    public void setSearchRecordItem(String searchRecordItem) {
        this.searchRecordItem = searchRecordItem == null ? null : searchRecordItem.trim();
    }

    public Date getSearchRecordTime() {
        return searchRecordTime;
    }

    public void setSearchRecordTime(Date searchRecordTime) {
        this.searchRecordTime = searchRecordTime;
    }
}