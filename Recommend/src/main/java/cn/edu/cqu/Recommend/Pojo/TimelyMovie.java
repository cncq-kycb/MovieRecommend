package cn.edu.cqu.Recommend.Pojo;

import java.math.BigDecimal;

public class TimelyMovie {
    private Integer movieId;

    private String movieName;

    private BigDecimal movieRate;

    private String director;

    private String movieImage;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage == null ? null : movieImage.trim();
    }
}