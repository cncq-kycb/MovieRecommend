package cn.edu.cqu.Recommend.Pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimelySessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimelySessionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Integer value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Integer value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Integer value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Integer value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Integer value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Integer> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Integer> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Integer value1, Integer value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdIsNull() {
            addCriterion("cinema_id is null");
            return (Criteria) this;
        }

        public Criteria andCinemaIdIsNotNull() {
            addCriterion("cinema_id is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaIdEqualTo(Integer value) {
            addCriterion("cinema_id =", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdNotEqualTo(Integer value) {
            addCriterion("cinema_id <>", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdGreaterThan(Integer value) {
            addCriterion("cinema_id >", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cinema_id >=", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdLessThan(Integer value) {
            addCriterion("cinema_id <", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cinema_id <=", value, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdIn(List<Integer> values) {
            addCriterion("cinema_id in", values, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdNotIn(List<Integer> values) {
            addCriterion("cinema_id not in", values, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdBetween(Integer value1, Integer value2) {
            addCriterion("cinema_id between", value1, value2, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andCinemaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cinema_id not between", value1, value2, "cinemaId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(Integer value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(Integer value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(Integer value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(Integer value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(Integer value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<Integer> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<Integer> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(Integer value1, Integer value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIsNull() {
            addCriterion("cinema_name is null");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIsNotNull() {
            addCriterion("cinema_name is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaNameEqualTo(String value) {
            addCriterion("cinema_name =", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotEqualTo(String value) {
            addCriterion("cinema_name <>", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameGreaterThan(String value) {
            addCriterion("cinema_name >", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("cinema_name >=", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLessThan(String value) {
            addCriterion("cinema_name <", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLessThanOrEqualTo(String value) {
            addCriterion("cinema_name <=", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLike(String value) {
            addCriterion("cinema_name like", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotLike(String value) {
            addCriterion("cinema_name not like", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIn(List<String> values) {
            addCriterion("cinema_name in", values, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotIn(List<String> values) {
            addCriterion("cinema_name not in", values, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameBetween(String value1, String value2) {
            addCriterion("cinema_name between", value1, value2, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotBetween(String value1, String value2) {
            addCriterion("cinema_name not between", value1, value2, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andSessionStartIsNull() {
            addCriterion("session_start is null");
            return (Criteria) this;
        }

        public Criteria andSessionStartIsNotNull() {
            addCriterion("session_start is not null");
            return (Criteria) this;
        }

        public Criteria andSessionStartEqualTo(Date value) {
            addCriterion("session_start =", value, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartNotEqualTo(Date value) {
            addCriterion("session_start <>", value, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartGreaterThan(Date value) {
            addCriterion("session_start >", value, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartGreaterThanOrEqualTo(Date value) {
            addCriterion("session_start >=", value, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartLessThan(Date value) {
            addCriterion("session_start <", value, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartLessThanOrEqualTo(Date value) {
            addCriterion("session_start <=", value, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartIn(List<Date> values) {
            addCriterion("session_start in", values, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartNotIn(List<Date> values) {
            addCriterion("session_start not in", values, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartBetween(Date value1, Date value2) {
            addCriterion("session_start between", value1, value2, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionStartNotBetween(Date value1, Date value2) {
            addCriterion("session_start not between", value1, value2, "sessionStart");
            return (Criteria) this;
        }

        public Criteria andSessionEndIsNull() {
            addCriterion("session_end is null");
            return (Criteria) this;
        }

        public Criteria andSessionEndIsNotNull() {
            addCriterion("session_end is not null");
            return (Criteria) this;
        }

        public Criteria andSessionEndEqualTo(Date value) {
            addCriterion("session_end =", value, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndNotEqualTo(Date value) {
            addCriterion("session_end <>", value, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndGreaterThan(Date value) {
            addCriterion("session_end >", value, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndGreaterThanOrEqualTo(Date value) {
            addCriterion("session_end >=", value, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndLessThan(Date value) {
            addCriterion("session_end <", value, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndLessThanOrEqualTo(Date value) {
            addCriterion("session_end <=", value, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndIn(List<Date> values) {
            addCriterion("session_end in", values, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndNotIn(List<Date> values) {
            addCriterion("session_end not in", values, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndBetween(Date value1, Date value2) {
            addCriterion("session_end between", value1, value2, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionEndNotBetween(Date value1, Date value2) {
            addCriterion("session_end not between", value1, value2, "sessionEnd");
            return (Criteria) this;
        }

        public Criteria andSessionPriceIsNull() {
            addCriterion("session_price is null");
            return (Criteria) this;
        }

        public Criteria andSessionPriceIsNotNull() {
            addCriterion("session_price is not null");
            return (Criteria) this;
        }

        public Criteria andSessionPriceEqualTo(BigDecimal value) {
            addCriterion("session_price =", value, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceNotEqualTo(BigDecimal value) {
            addCriterion("session_price <>", value, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceGreaterThan(BigDecimal value) {
            addCriterion("session_price >", value, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("session_price >=", value, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceLessThan(BigDecimal value) {
            addCriterion("session_price <", value, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("session_price <=", value, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceIn(List<BigDecimal> values) {
            addCriterion("session_price in", values, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceNotIn(List<BigDecimal> values) {
            addCriterion("session_price not in", values, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("session_price between", value1, value2, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("session_price not between", value1, value2, "sessionPrice");
            return (Criteria) this;
        }

        public Criteria andSessionSiteIsNull() {
            addCriterion("session_site is null");
            return (Criteria) this;
        }

        public Criteria andSessionSiteIsNotNull() {
            addCriterion("session_site is not null");
            return (Criteria) this;
        }

        public Criteria andSessionSiteEqualTo(String value) {
            addCriterion("session_site =", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteNotEqualTo(String value) {
            addCriterion("session_site <>", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteGreaterThan(String value) {
            addCriterion("session_site >", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteGreaterThanOrEqualTo(String value) {
            addCriterion("session_site >=", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteLessThan(String value) {
            addCriterion("session_site <", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteLessThanOrEqualTo(String value) {
            addCriterion("session_site <=", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteLike(String value) {
            addCriterion("session_site like", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteNotLike(String value) {
            addCriterion("session_site not like", value, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteIn(List<String> values) {
            addCriterion("session_site in", values, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteNotIn(List<String> values) {
            addCriterion("session_site not in", values, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteBetween(String value1, String value2) {
            addCriterion("session_site between", value1, value2, "sessionSite");
            return (Criteria) this;
        }

        public Criteria andSessionSiteNotBetween(String value1, String value2) {
            addCriterion("session_site not between", value1, value2, "sessionSite");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}