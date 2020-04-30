package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class UpFanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public UpFanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
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

        public Criteria andUpidIsNull() {
            addCriterion("UPID is null");
            return (Criteria) this;
        }

        public Criteria andUpidIsNotNull() {
            addCriterion("UPID is not null");
            return (Criteria) this;
        }

        public Criteria andUpidEqualTo(String value) {
            addCriterion("UPID =", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotEqualTo(String value) {
            addCriterion("UPID <>", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThan(String value) {
            addCriterion("UPID >", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThanOrEqualTo(String value) {
            addCriterion("UPID >=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThan(String value) {
            addCriterion("UPID <", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThanOrEqualTo(String value) {
            addCriterion("UPID <=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLike(String value) {
            addCriterion("UPID like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotLike(String value) {
            addCriterion("UPID not like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidIn(List<String> values) {
            addCriterion("UPID in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotIn(List<String> values) {
            addCriterion("UPID not in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidBetween(String value1, String value2) {
            addCriterion("UPID between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotBetween(String value1, String value2) {
            addCriterion("UPID not between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andFanidIsNull() {
            addCriterion("FANID is null");
            return (Criteria) this;
        }

        public Criteria andFanidIsNotNull() {
            addCriterion("FANID is not null");
            return (Criteria) this;
        }

        public Criteria andFanidEqualTo(String value) {
            addCriterion("FANID =", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidNotEqualTo(String value) {
            addCriterion("FANID <>", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidGreaterThan(String value) {
            addCriterion("FANID >", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidGreaterThanOrEqualTo(String value) {
            addCriterion("FANID >=", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidLessThan(String value) {
            addCriterion("FANID <", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidLessThanOrEqualTo(String value) {
            addCriterion("FANID <=", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidLike(String value) {
            addCriterion("FANID like", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidNotLike(String value) {
            addCriterion("FANID not like", value, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidIn(List<String> values) {
            addCriterion("FANID in", values, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidNotIn(List<String> values) {
            addCriterion("FANID not in", values, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidBetween(String value1, String value2) {
            addCriterion("FANID between", value1, value2, "fanid");
            return (Criteria) this;
        }

        public Criteria andFanidNotBetween(String value1, String value2) {
            addCriterion("FANID not between", value1, value2, "fanid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table up_fan
     *
     * @mbg.generated do_not_delete_during_merge Thu Apr 30 13:35:21 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table up_fan
     *
     * @mbg.generated Thu Apr 30 13:35:21 CST 2020
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