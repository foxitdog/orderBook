package com.blackfox.orderbook.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    /**
     * tb_customer
     */
    protected String orderByClause;

    /**
     * tb_customer
     */
    protected boolean distinct;

    /**
     * tb_customer
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * tb_customer 2018-03-25
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andDhhmIsNull() {
            addCriterion("dhhm is null");
            return (Criteria) this;
        }

        public Criteria andDhhmIsNotNull() {
            addCriterion("dhhm is not null");
            return (Criteria) this;
        }

        public Criteria andDhhmEqualTo(String value) {
            addCriterion("dhhm =", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmNotEqualTo(String value) {
            addCriterion("dhhm <>", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmGreaterThan(String value) {
            addCriterion("dhhm >", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmGreaterThanOrEqualTo(String value) {
            addCriterion("dhhm >=", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmLessThan(String value) {
            addCriterion("dhhm <", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmLessThanOrEqualTo(String value) {
            addCriterion("dhhm <=", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmLike(String value) {
            addCriterion("dhhm like", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmNotLike(String value) {
            addCriterion("dhhm not like", value, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmIn(List<String> values) {
            addCriterion("dhhm in", values, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmNotIn(List<String> values) {
            addCriterion("dhhm not in", values, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmBetween(String value1, String value2) {
            addCriterion("dhhm between", value1, value2, "dhhm");
            return (Criteria) this;
        }

        public Criteria andDhhmNotBetween(String value1, String value2) {
            addCriterion("dhhm not between", value1, value2, "dhhm");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNull() {
            addCriterion("sjhm is null");
            return (Criteria) this;
        }

        public Criteria andSjhmIsNotNull() {
            addCriterion("sjhm is not null");
            return (Criteria) this;
        }

        public Criteria andSjhmEqualTo(String value) {
            addCriterion("sjhm =", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotEqualTo(String value) {
            addCriterion("sjhm <>", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThan(String value) {
            addCriterion("sjhm >", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmGreaterThanOrEqualTo(String value) {
            addCriterion("sjhm >=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThan(String value) {
            addCriterion("sjhm <", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLessThanOrEqualTo(String value) {
            addCriterion("sjhm <=", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmLike(String value) {
            addCriterion("sjhm like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotLike(String value) {
            addCriterion("sjhm not like", value, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmIn(List<String> values) {
            addCriterion("sjhm in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotIn(List<String> values) {
            addCriterion("sjhm not in", values, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmBetween(String value1, String value2) {
            addCriterion("sjhm between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andSjhmNotBetween(String value1, String value2) {
            addCriterion("sjhm not between", value1, value2, "sjhm");
            return (Criteria) this;
        }

        public Criteria andZjIsNull() {
            addCriterion("zj is null");
            return (Criteria) this;
        }

        public Criteria andZjIsNotNull() {
            addCriterion("zj is not null");
            return (Criteria) this;
        }

        public Criteria andZjEqualTo(String value) {
            addCriterion("zj =", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotEqualTo(String value) {
            addCriterion("zj <>", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThan(String value) {
            addCriterion("zj >", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThanOrEqualTo(String value) {
            addCriterion("zj >=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThan(String value) {
            addCriterion("zj <", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThanOrEqualTo(String value) {
            addCriterion("zj <=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLike(String value) {
            addCriterion("zj like", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotLike(String value) {
            addCriterion("zj not like", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjIn(List<String> values) {
            addCriterion("zj in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotIn(List<String> values) {
            addCriterion("zj not in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjBetween(String value1, String value2) {
            addCriterion("zj between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotBetween(String value1, String value2) {
            addCriterion("zj not between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("zt is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("zt is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("zt =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("zt <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("zt >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("zt >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("zt <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("zt <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("zt like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("zt not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("zt in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("zt not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("zt between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("zt not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtbgsjIsNull() {
            addCriterion("ztbgsj is null");
            return (Criteria) this;
        }

        public Criteria andZtbgsjIsNotNull() {
            addCriterion("ztbgsj is not null");
            return (Criteria) this;
        }

        public Criteria andZtbgsjEqualTo(String value) {
            addCriterion("ztbgsj =", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjNotEqualTo(String value) {
            addCriterion("ztbgsj <>", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjGreaterThan(String value) {
            addCriterion("ztbgsj >", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjGreaterThanOrEqualTo(String value) {
            addCriterion("ztbgsj >=", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjLessThan(String value) {
            addCriterion("ztbgsj <", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjLessThanOrEqualTo(String value) {
            addCriterion("ztbgsj <=", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjLike(String value) {
            addCriterion("ztbgsj like", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjNotLike(String value) {
            addCriterion("ztbgsj not like", value, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjIn(List<String> values) {
            addCriterion("ztbgsj in", values, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjNotIn(List<String> values) {
            addCriterion("ztbgsj not in", values, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjBetween(String value1, String value2) {
            addCriterion("ztbgsj between", value1, value2, "ztbgsj");
            return (Criteria) this;
        }

        public Criteria andZtbgsjNotBetween(String value1, String value2) {
            addCriterion("ztbgsj not between", value1, value2, "ztbgsj");
            return (Criteria) this;
        }
    }

    /**
     * tb_customer
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_customer 2018-03-25
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