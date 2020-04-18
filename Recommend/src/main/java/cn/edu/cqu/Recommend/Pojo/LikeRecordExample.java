package cn.edu.cqu.Recommend.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LikeRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikeRecordExample() {
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

        public Criteria andLikeRecordIdIsNull() {
            addCriterion("like_record_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdIsNotNull() {
            addCriterion("like_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdEqualTo(Integer value) {
            addCriterion("like_record_id =", value, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdNotEqualTo(Integer value) {
            addCriterion("like_record_id <>", value, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdGreaterThan(Integer value) {
            addCriterion("like_record_id >", value, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_record_id >=", value, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdLessThan(Integer value) {
            addCriterion("like_record_id <", value, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("like_record_id <=", value, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdIn(List<Integer> values) {
            addCriterion("like_record_id in", values, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdNotIn(List<Integer> values) {
            addCriterion("like_record_id not in", values, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("like_record_id between", value1, value2, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andLikeRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("like_record_id not between", value1, value2, "likeRecordId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("user_tel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(Long value) {
            addCriterion("user_tel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(Long value) {
            addCriterion("user_tel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(Long value) {
            addCriterion("user_tel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(Long value) {
            addCriterion("user_tel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(Long value) {
            addCriterion("user_tel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(Long value) {
            addCriterion("user_tel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<Long> values) {
            addCriterion("user_tel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<Long> values) {
            addCriterion("user_tel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(Long value1, Long value2) {
            addCriterion("user_tel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(Long value1, Long value2) {
            addCriterion("user_tel not between", value1, value2, "userTel");
            return (Criteria) this;
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

        public Criteria andLikeRecordTimeIsNull() {
            addCriterion("like_record_time is null");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeIsNotNull() {
            addCriterion("like_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeEqualTo(Date value) {
            addCriterion("like_record_time =", value, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeNotEqualTo(Date value) {
            addCriterion("like_record_time <>", value, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeGreaterThan(Date value) {
            addCriterion("like_record_time >", value, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("like_record_time >=", value, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeLessThan(Date value) {
            addCriterion("like_record_time <", value, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("like_record_time <=", value, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeIn(List<Date> values) {
            addCriterion("like_record_time in", values, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeNotIn(List<Date> values) {
            addCriterion("like_record_time not in", values, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeBetween(Date value1, Date value2) {
            addCriterion("like_record_time between", value1, value2, "likeRecordTime");
            return (Criteria) this;
        }

        public Criteria andLikeRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("like_record_time not between", value1, value2, "likeRecordTime");
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