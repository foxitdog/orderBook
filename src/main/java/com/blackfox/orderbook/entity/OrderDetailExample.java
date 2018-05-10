package com.blackfox.orderbook.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    /**
     * tb_order_detail
     */
    protected String orderByClause;

    /**
     * tb_order_detail
     */
    protected boolean distinct;

    /**
     * tb_order_detail
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public OrderDetailExample() {
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
     * tb_order_detail 2018-03-25
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

        public Criteria andDdbhIsNull() {
            addCriterion("ddbh is null");
            return (Criteria) this;
        }

        public Criteria andDdbhIsNotNull() {
            addCriterion("ddbh is not null");
            return (Criteria) this;
        }

        public Criteria andDdbhEqualTo(String value) {
            addCriterion("ddbh =", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotEqualTo(String value) {
            addCriterion("ddbh <>", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhGreaterThan(String value) {
            addCriterion("ddbh >", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhGreaterThanOrEqualTo(String value) {
            addCriterion("ddbh >=", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhLessThan(String value) {
            addCriterion("ddbh <", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhLessThanOrEqualTo(String value) {
            addCriterion("ddbh <=", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhLike(String value) {
            addCriterion("ddbh like", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotLike(String value) {
            addCriterion("ddbh not like", value, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhIn(List<String> values) {
            addCriterion("ddbh in", values, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotIn(List<String> values) {
            addCriterion("ddbh not in", values, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhBetween(String value1, String value2) {
            addCriterion("ddbh between", value1, value2, "ddbh");
            return (Criteria) this;
        }

        public Criteria andDdbhNotBetween(String value1, String value2) {
            addCriterion("ddbh not between", value1, value2, "ddbh");
            return (Criteria) this;
        }

        public Criteria andSpbhIsNull() {
            addCriterion("spbh is null");
            return (Criteria) this;
        }

        public Criteria andSpbhIsNotNull() {
            addCriterion("spbh is not null");
            return (Criteria) this;
        }

        public Criteria andSpbhEqualTo(String value) {
            addCriterion("spbh =", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhNotEqualTo(String value) {
            addCriterion("spbh <>", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhGreaterThan(String value) {
            addCriterion("spbh >", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhGreaterThanOrEqualTo(String value) {
            addCriterion("spbh >=", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhLessThan(String value) {
            addCriterion("spbh <", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhLessThanOrEqualTo(String value) {
            addCriterion("spbh <=", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhLike(String value) {
            addCriterion("spbh like", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhNotLike(String value) {
            addCriterion("spbh not like", value, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhIn(List<String> values) {
            addCriterion("spbh in", values, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhNotIn(List<String> values) {
            addCriterion("spbh not in", values, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhBetween(String value1, String value2) {
            addCriterion("spbh between", value1, value2, "spbh");
            return (Criteria) this;
        }

        public Criteria andSpbhNotBetween(String value1, String value2) {
            addCriterion("spbh not between", value1, value2, "spbh");
            return (Criteria) this;
        }

        public Criteria andDjIsNull() {
            addCriterion("dj is null");
            return (Criteria) this;
        }

        public Criteria andDjIsNotNull() {
            addCriterion("dj is not null");
            return (Criteria) this;
        }

        public Criteria andDjEqualTo(String value) {
            addCriterion("dj =", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotEqualTo(String value) {
            addCriterion("dj <>", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThan(String value) {
            addCriterion("dj >", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjGreaterThanOrEqualTo(String value) {
            addCriterion("dj >=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThan(String value) {
            addCriterion("dj <", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLessThanOrEqualTo(String value) {
            addCriterion("dj <=", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjLike(String value) {
            addCriterion("dj like", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotLike(String value) {
            addCriterion("dj not like", value, "dj");
            return (Criteria) this;
        }

        public Criteria andDjIn(List<String> values) {
            addCriterion("dj in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotIn(List<String> values) {
            addCriterion("dj not in", values, "dj");
            return (Criteria) this;
        }

        public Criteria andDjBetween(String value1, String value2) {
            addCriterion("dj between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andDjNotBetween(String value1, String value2) {
            addCriterion("dj not between", value1, value2, "dj");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("sl is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("sl is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(String value) {
            addCriterion("sl =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(String value) {
            addCriterion("sl <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(String value) {
            addCriterion("sl >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(String value) {
            addCriterion("sl >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(String value) {
            addCriterion("sl <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(String value) {
            addCriterion("sl <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLike(String value) {
            addCriterion("sl like", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotLike(String value) {
            addCriterion("sl not like", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<String> values) {
            addCriterion("sl in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<String> values) {
            addCriterion("sl not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(String value1, String value2) {
            addCriterion("sl between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(String value1, String value2) {
            addCriterion("sl not between", value1, value2, "sl");
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
     * tb_order_detail
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_order_detail 2018-03-25
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