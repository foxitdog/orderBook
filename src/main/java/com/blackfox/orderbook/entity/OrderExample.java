package com.blackfox.orderbook.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    /**
     * tb_order
     */
    protected String orderByClause;

    /**
     * tb_order
     */
    protected boolean distinct;

    /**
     * tb_order
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public OrderExample() {
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
     * tb_order 2018-03-25
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

        public Criteria andKhbhIsNull() {
            addCriterion("khbh is null");
            return (Criteria) this;
        }

        public Criteria andKhbhIsNotNull() {
            addCriterion("khbh is not null");
            return (Criteria) this;
        }

        public Criteria andKhbhEqualTo(String value) {
            addCriterion("khbh =", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotEqualTo(String value) {
            addCriterion("khbh <>", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhGreaterThan(String value) {
            addCriterion("khbh >", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhGreaterThanOrEqualTo(String value) {
            addCriterion("khbh >=", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLessThan(String value) {
            addCriterion("khbh <", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLessThanOrEqualTo(String value) {
            addCriterion("khbh <=", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhLike(String value) {
            addCriterion("khbh like", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotLike(String value) {
            addCriterion("khbh not like", value, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhIn(List<String> values) {
            addCriterion("khbh in", values, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotIn(List<String> values) {
            addCriterion("khbh not in", values, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhBetween(String value1, String value2) {
            addCriterion("khbh between", value1, value2, "khbh");
            return (Criteria) this;
        }

        public Criteria andKhbhNotBetween(String value1, String value2) {
            addCriterion("khbh not between", value1, value2, "khbh");
            return (Criteria) this;
        }

        public Criteria andDdjeIsNull() {
            addCriterion("ddje is null");
            return (Criteria) this;
        }

        public Criteria andDdjeIsNotNull() {
            addCriterion("ddje is not null");
            return (Criteria) this;
        }

        public Criteria andDdjeEqualTo(String value) {
            addCriterion("ddje =", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeNotEqualTo(String value) {
            addCriterion("ddje <>", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeGreaterThan(String value) {
            addCriterion("ddje >", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeGreaterThanOrEqualTo(String value) {
            addCriterion("ddje >=", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeLessThan(String value) {
            addCriterion("ddje <", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeLessThanOrEqualTo(String value) {
            addCriterion("ddje <=", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeLike(String value) {
            addCriterion("ddje like", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeNotLike(String value) {
            addCriterion("ddje not like", value, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeIn(List<String> values) {
            addCriterion("ddje in", values, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeNotIn(List<String> values) {
            addCriterion("ddje not in", values, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeBetween(String value1, String value2) {
            addCriterion("ddje between", value1, value2, "ddje");
            return (Criteria) this;
        }

        public Criteria andDdjeNotBetween(String value1, String value2) {
            addCriterion("ddje not between", value1, value2, "ddje");
            return (Criteria) this;
        }

        public Criteria andYhjeIsNull() {
            addCriterion("yhje is null");
            return (Criteria) this;
        }

        public Criteria andYhjeIsNotNull() {
            addCriterion("yhje is not null");
            return (Criteria) this;
        }

        public Criteria andYhjeEqualTo(String value) {
            addCriterion("yhje =", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotEqualTo(String value) {
            addCriterion("yhje <>", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeGreaterThan(String value) {
            addCriterion("yhje >", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeGreaterThanOrEqualTo(String value) {
            addCriterion("yhje >=", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeLessThan(String value) {
            addCriterion("yhje <", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeLessThanOrEqualTo(String value) {
            addCriterion("yhje <=", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeLike(String value) {
            addCriterion("yhje like", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotLike(String value) {
            addCriterion("yhje not like", value, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeIn(List<String> values) {
            addCriterion("yhje in", values, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotIn(List<String> values) {
            addCriterion("yhje not in", values, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeBetween(String value1, String value2) {
            addCriterion("yhje between", value1, value2, "yhje");
            return (Criteria) this;
        }

        public Criteria andYhjeNotBetween(String value1, String value2) {
            addCriterion("yhje not between", value1, value2, "yhje");
            return (Criteria) this;
        }

        public Criteria andDdztIsNull() {
            addCriterion("ddzt is null");
            return (Criteria) this;
        }

        public Criteria andDdztIsNotNull() {
            addCriterion("ddzt is not null");
            return (Criteria) this;
        }

        public Criteria andDdztEqualTo(String value) {
            addCriterion("ddzt =", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztNotEqualTo(String value) {
            addCriterion("ddzt <>", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztGreaterThan(String value) {
            addCriterion("ddzt >", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztGreaterThanOrEqualTo(String value) {
            addCriterion("ddzt >=", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztLessThan(String value) {
            addCriterion("ddzt <", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztLessThanOrEqualTo(String value) {
            addCriterion("ddzt <=", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztLike(String value) {
            addCriterion("ddzt like", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztNotLike(String value) {
            addCriterion("ddzt not like", value, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztIn(List<String> values) {
            addCriterion("ddzt in", values, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztNotIn(List<String> values) {
            addCriterion("ddzt not in", values, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztBetween(String value1, String value2) {
            addCriterion("ddzt between", value1, value2, "ddzt");
            return (Criteria) this;
        }

        public Criteria andDdztNotBetween(String value1, String value2) {
            addCriterion("ddzt not between", value1, value2, "ddzt");
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
     * tb_order
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_order 2018-03-25
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