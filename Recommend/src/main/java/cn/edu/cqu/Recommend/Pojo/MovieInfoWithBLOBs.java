package cn.edu.cqu.Recommend.Pojo;

public class MovieInfoWithBLOBs extends MovieInfo {
    private String movieType;

    private String actor;

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType == null ? null : movieType.trim();
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }
}