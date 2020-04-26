package cn.edu.cqu.Recommend.Pojo;

import java.math.BigDecimal;

public class MovieInfoRecommend {
    private Integer userId;

    private Integer movieId;

    private Integer score;

    private String movieName;

    private BigDecimal movieRate;

    private String movieImage;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public BigDecimal getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(BigDecimal movieRate) {
        this.movieRate = movieRate;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage == null ? null : movieImage.trim();
    }
}