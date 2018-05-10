package com.blackfox.orderbook.entity;

import java.util.ArrayList;
import java.util.List;

public class ManufactorExample {
    /**
     * tb_manufactor
     */
    protected String orderByClause;

    /**
     * tb_manufactor
     */
    protected boolean distinct;

    /**
     * tb_manufactor
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public ManufactorExample() {
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
     * tb_manufactor 2018-03-25
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

        public Criteria andCjmcIsNull() {
            addCriterion("cjmc is null");
            return (Criteria) this;
        }

        public Criteria andCjmcIsNotNull() {
            addCriterion("cjmc is not null");
            return (Criteria) this;
        }

        public Criteria andCjmcEqualTo(String value) {
            addCriterion("cjmc =", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotEqualTo(String value) {
            addCriterion("cjmc <>", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcGreaterThan(String value) {
            addCriterion("cjmc >", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcGreaterThanOrEqualTo(String value) {
            addCriterion("cjmc >=", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcLessThan(String value) {
            addCriterion("cjmc <", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcLessThanOrEqualTo(String value) {
            addCriterion("cjmc <=", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcLike(String value) {
            addCriterion("cjmc like", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotLike(String value) {
            addCriterion("cjmc not like", value, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcIn(List<String> values) {
            addCriterion("cjmc in", values, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotIn(List<String> values) {
            addCriterion("cjmc not in", values, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcBetween(String value1, String value2) {
            addCriterion("cjmc between", value1, value2, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjmcNotBetween(String value1, String value2) {
            addCriterion("cjmc not between", value1, value2, "cjmc");
            return (Criteria) this;
        }

        public Criteria andCjhmIsNull() {
            addCriterion("cjhm is null");
            return (Criteria) this;
        }

        public Criteria andCjhmIsNotNull() {
            addCriterion("cjhm is not null");
            return (Criteria) this;
        }

        public Criteria andCjhmEqualTo(String value) {
            addCriterion("cjhm =", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmNotEqualTo(String value) {
            addCriterion("cjhm <>", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmGreaterThan(String value) {
            addCriterion("cjhm >", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmGreaterThanOrEqualTo(String value) {
            addCriterion("cjhm >=", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmLessThan(String value) {
            addCriterion("cjhm <", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmLessThanOrEqualTo(String value) {
            addCriterion("cjhm <=", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmLike(String value) {
            addCriterion("cjhm like", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmNotLike(String value) {
            addCriterion("cjhm not like", value, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmIn(List<String> values) {
            addCriterion("cjhm in", values, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmNotIn(List<String> values) {
            addCriterion("cjhm not in", values, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmBetween(String value1, String value2) {
            addCriterion("cjhm between", value1, value2, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjhmNotBetween(String value1, String value2) {
            addCriterion("cjhm not between", value1, value2, "cjhm");
            return (Criteria) this;
        }

        public Criteria andCjdzIsNull() {
            addCriterion("cjdz is null");
            return (Criteria) this;
        }

        public Criteria andCjdzIsNotNull() {
            addCriterion("cjdz is not null");
            return (Criteria) this;
        }

        public Criteria andCjdzEqualTo(String value) {
            addCriterion("cjdz =", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzNotEqualTo(String value) {
            addCriterion("cjdz <>", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzGreaterThan(String value) {
            addCriterion("cjdz >", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzGreaterThanOrEqualTo(String value) {
            addCriterion("cjdz >=", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzLessThan(String value) {
            addCriterion("cjdz <", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzLessThanOrEqualTo(String value) {
            addCriterion("cjdz <=", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzLike(String value) {
            addCriterion("cjdz like", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzNotLike(String value) {
            addCriterion("cjdz not like", value, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzIn(List<String> values) {
            addCriterion("cjdz in", values, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzNotIn(List<String> values) {
            addCriterion("cjdz not in", values, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzBetween(String value1, String value2) {
            addCriterion("cjdz between", value1, value2, "cjdz");
            return (Criteria) this;
        }

        public Criteria andCjdzNotBetween(String value1, String value2) {
            addCriterion("cjdz not between", value1, value2, "cjdz");
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
     * tb_manufactor
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_manufactor 2018-03-25
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