package com.mxh.weibo.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeiboExample {
    /**
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public WeiboExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
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

        public Criteria andUuidIsNull() {
            addCriterion("weibo.UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("weibo.UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("weibo.UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("weibo.UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("weibo.UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("weibo.UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("weibo.UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("weibo.UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("weibo.UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("weibo.UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("weibo.UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("weibo.UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("weibo.UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("weibo.UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNull() {
            addCriterion("weibo.USER_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNotNull() {
            addCriterion("weibo.USER_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameEqualTo(String value) {
            addCriterion("weibo.USER_USERNAME =", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotEqualTo(String value) {
            addCriterion("weibo.USER_USERNAME <>", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThan(String value) {
            addCriterion("weibo.USER_USERNAME >", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("weibo.USER_USERNAME >=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThan(String value) {
            addCriterion("weibo.USER_USERNAME <", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThanOrEqualTo(String value) {
            addCriterion("weibo.USER_USERNAME <=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLike(String value) {
            addCriterion("weibo.USER_USERNAME like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotLike(String value) {
            addCriterion("weibo.USER_USERNAME not like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIn(List<String> values) {
            addCriterion("weibo.USER_USERNAME in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotIn(List<String> values) {
            addCriterion("weibo.USER_USERNAME not in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameBetween(String value1, String value2) {
            addCriterion("weibo.USER_USERNAME between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotBetween(String value1, String value2) {
            addCriterion("weibo.USER_USERNAME not between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("weibo.USER_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("weibo.USER_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("weibo.USER_NICKNAME =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("weibo.USER_NICKNAME <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("weibo.USER_NICKNAME >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("weibo.USER_NICKNAME >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("weibo.USER_NICKNAME <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("weibo.USER_NICKNAME <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("weibo.USER_NICKNAME like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("weibo.USER_NICKNAME not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("weibo.USER_NICKNAME in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("weibo.USER_NICKNAME not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("weibo.USER_NICKNAME between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("weibo.USER_NICKNAME not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgIsNull() {
            addCriterion("weibo.USER_HEADIMG is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgIsNotNull() {
            addCriterion("weibo.USER_HEADIMG is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgEqualTo(String value) {
            addCriterion("weibo.USER_HEADIMG =", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgNotEqualTo(String value) {
            addCriterion("weibo.USER_HEADIMG <>", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgGreaterThan(String value) {
            addCriterion("weibo.USER_HEADIMG >", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("weibo.USER_HEADIMG >=", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgLessThan(String value) {
            addCriterion("weibo.USER_HEADIMG <", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgLessThanOrEqualTo(String value) {
            addCriterion("weibo.USER_HEADIMG <=", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgLike(String value) {
            addCriterion("weibo.USER_HEADIMG like", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgNotLike(String value) {
            addCriterion("weibo.USER_HEADIMG not like", value, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgIn(List<String> values) {
            addCriterion("weibo.USER_HEADIMG in", values, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgNotIn(List<String> values) {
            addCriterion("weibo.USER_HEADIMG not in", values, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgBetween(String value1, String value2) {
            addCriterion("weibo.USER_HEADIMG between", value1, value2, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andUserHeadimgNotBetween(String value1, String value2) {
            addCriterion("weibo.USER_HEADIMG not between", value1, value2, "userHeadimg");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("weibo.PUBLISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("weibo.PUBLISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("weibo.PUBLISH_TIME =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("weibo.PUBLISH_TIME <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("weibo.PUBLISH_TIME >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("weibo.PUBLISH_TIME >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("weibo.PUBLISH_TIME <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("weibo.PUBLISH_TIME <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("weibo.PUBLISH_TIME in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("weibo.PUBLISH_TIME not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("weibo.PUBLISH_TIME between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("weibo.PUBLISH_TIME not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("weibo.CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("weibo.CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("weibo.CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("weibo.CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("weibo.CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("weibo.CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("weibo.CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("weibo.CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("weibo.CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("weibo.CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("weibo.CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("weibo.CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("weibo.CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("weibo.CONTENT not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNull() {
            addCriterion("weibo.PRAISE is null");
            return (Criteria) this;
        }

        public Criteria andPraiseIsNotNull() {
            addCriterion("weibo.PRAISE is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseEqualTo(Integer value) {
            addCriterion("weibo.PRAISE =", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotEqualTo(Integer value) {
            addCriterion("weibo.PRAISE <>", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThan(Integer value) {
            addCriterion("weibo.PRAISE >", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("weibo.PRAISE >=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThan(Integer value) {
            addCriterion("weibo.PRAISE <", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("weibo.PRAISE <=", value, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseIn(List<Integer> values) {
            addCriterion("weibo.PRAISE in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotIn(List<Integer> values) {
            addCriterion("weibo.PRAISE not in", values, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseBetween(Integer value1, Integer value2) {
            addCriterion("weibo.PRAISE between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("weibo.PRAISE not between", value1, value2, "praise");
            return (Criteria) this;
        }

        public Criteria andLikeIsNull() {
            addCriterion("weibo.LIKE is null");
            return (Criteria) this;
        }

        public Criteria andLikeIsNotNull() {
            addCriterion("weibo.LIKE is not null");
            return (Criteria) this;
        }

        public Criteria andLikeEqualTo(Integer value) {
            addCriterion("weibo.LIKE =", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotEqualTo(Integer value) {
            addCriterion("weibo.LIKE <>", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThan(Integer value) {
            addCriterion("weibo.LIKE >", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("weibo.LIKE >=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThan(Integer value) {
            addCriterion("weibo.LIKE <", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThanOrEqualTo(Integer value) {
            addCriterion("weibo.LIKE <=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeIn(List<Integer> values) {
            addCriterion("weibo.LIKE in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotIn(List<Integer> values) {
            addCriterion("weibo.LIKE not in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeBetween(Integer value1, Integer value2) {
            addCriterion("weibo.LIKE between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("weibo.LIKE not between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andReplyUuidIsNull() {
            addCriterion("weibo.REPLY_UUID is null");
            return (Criteria) this;
        }

        public Criteria andReplyUuidIsNotNull() {
            addCriterion("weibo.REPLY_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUuidEqualTo(String value) {
            addCriterion("weibo.REPLY_UUID =", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidNotEqualTo(String value) {
            addCriterion("weibo.REPLY_UUID <>", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidGreaterThan(String value) {
            addCriterion("weibo.REPLY_UUID >", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidGreaterThanOrEqualTo(String value) {
            addCriterion("weibo.REPLY_UUID >=", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidLessThan(String value) {
            addCriterion("weibo.REPLY_UUID <", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidLessThanOrEqualTo(String value) {
            addCriterion("weibo.REPLY_UUID <=", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidLike(String value) {
            addCriterion("weibo.REPLY_UUID like", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidNotLike(String value) {
            addCriterion("weibo.REPLY_UUID not like", value, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidIn(List<String> values) {
            addCriterion("weibo.REPLY_UUID in", values, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidNotIn(List<String> values) {
            addCriterion("weibo.REPLY_UUID not in", values, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidBetween(String value1, String value2) {
            addCriterion("weibo.REPLY_UUID between", value1, value2, "replyUuid");
            return (Criteria) this;
        }

        public Criteria andReplyUuidNotBetween(String value1, String value2) {
            addCriterion("weibo.REPLY_UUID not between", value1, value2, "replyUuid");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table weibo_weibo
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table weibo_weibo
     *
     * @mbggenerated
     */
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