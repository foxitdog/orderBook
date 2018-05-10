package com.blackfox.orderbook.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    /**
     * tb_product
     */
    protected String orderByClause;

    /**
     * tb_product
     */
    protected boolean distinct;

    /**
     * tb_product
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-03-25
     */
    public ProductExample() {
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
     * tb_product 2018-03-25
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

        public Criteria andXhIsNull() {
            addCriterion("xh is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("xh is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("xh =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("xh <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("xh >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("xh >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("xh <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("xh <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("xh like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("xh not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("xh in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("xh not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("xh between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("xh not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andLxIsNull() {
            addCriterion("lx is null");
            return (Criteria) this;
        }

        public Criteria andLxIsNotNull() {
            addCriterion("lx is not null");
            return (Criteria) this;
        }

        public Criteria andLxEqualTo(String value) {
            addCriterion("lx =", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotEqualTo(String value) {
            addCriterion("lx <>", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThan(String value) {
            addCriterion("lx >", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThanOrEqualTo(String value) {
            addCriterion("lx >=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThan(String value) {
            addCriterion("lx <", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThanOrEqualTo(String value) {
            addCriterion("lx <=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLike(String value) {
            addCriterion("lx like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotLike(String value) {
            addCriterion("lx not like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxIn(List<String> values) {
            addCriterion("lx in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotIn(List<String> values) {
            addCriterion("lx not in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxBetween(String value1, String value2) {
            addCriterion("lx between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotBetween(String value1, String value2) {
            addCriterion("lx not between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andCjIsNull() {
            addCriterion("cj is null");
            return (Criteria) this;
        }

        public Criteria andCjIsNotNull() {
            addCriterion("cj is not null");
            return (Criteria) this;
        }

        public Criteria andCjEqualTo(String value) {
            addCriterion("cj =", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotEqualTo(String value) {
            addCriterion("cj <>", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThan(String value) {
            addCriterion("cj >", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThanOrEqualTo(String value) {
            addCriterion("cj >=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThan(String value) {
            addCriterion("cj <", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThanOrEqualTo(String value) {
            addCriterion("cj <=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLike(String value) {
            addCriterion("cj like", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotLike(String value) {
            addCriterion("cj not like", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjIn(List<String> values) {
            addCriterion("cj in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotIn(List<String> values) {
            addCriterion("cj not in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjBetween(String value1, String value2) {
            addCriterion("cj between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotBetween(String value1, String value2) {
            addCriterion("cj not between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andYjIsNull() {
            addCriterion("yj is null");
            return (Criteria) this;
        }

        public Criteria andYjIsNotNull() {
            addCriterion("yj is not null");
            return (Criteria) this;
        }

        public Criteria andYjEqualTo(String value) {
            addCriterion("yj =", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjNotEqualTo(String value) {
            addCriterion("yj <>", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjGreaterThan(String value) {
            addCriterion("yj >", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjGreaterThanOrEqualTo(String value) {
            addCriterion("yj >=", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjLessThan(String value) {
            addCriterion("yj <", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjLessThanOrEqualTo(String value) {
            addCriterion("yj <=", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjLike(String value) {
            addCriterion("yj like", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjNotLike(String value) {
            addCriterion("yj not like", value, "yj");
            return (Criteria) this;
        }

        public Criteria andYjIn(List<String> values) {
            addCriterion("yj in", values, "yj");
            return (Criteria) this;
        }

        public Criteria andYjNotIn(List<String> values) {
            addCriterion("yj not in", values, "yj");
            return (Criteria) this;
        }

        public Criteria andYjBetween(String value1, String value2) {
            addCriterion("yj between", value1, value2, "yj");
            return (Criteria) this;
        }

        public Criteria andYjNotBetween(String value1, String value2) {
            addCriterion("yj not between", value1, value2, "yj");
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

        public Criteria andZddjIsNull() {
            addCriterion("zddj is null");
            return (Criteria) this;
        }

        public Criteria andZddjIsNotNull() {
            addCriterion("zddj is not null");
            return (Criteria) this;
        }

        public Criteria andZddjEqualTo(String value) {
            addCriterion("zddj =", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjNotEqualTo(String value) {
            addCriterion("zddj <>", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjGreaterThan(String value) {
            addCriterion("zddj >", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjGreaterThanOrEqualTo(String value) {
            addCriterion("zddj >=", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjLessThan(String value) {
            addCriterion("zddj <", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjLessThanOrEqualTo(String value) {
            addCriterion("zddj <=", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjLike(String value) {
            addCriterion("zddj like", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjNotLike(String value) {
            addCriterion("zddj not like", value, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjIn(List<String> values) {
            addCriterion("zddj in", values, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjNotIn(List<String> values) {
            addCriterion("zddj not in", values, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjBetween(String value1, String value2) {
            addCriterion("zddj between", value1, value2, "zddj");
            return (Criteria) this;
        }

        public Criteria andZddjNotBetween(String value1, String value2) {
            addCriterion("zddj not between", value1, value2, "zddj");
            return (Criteria) this;
        }

        public Criteria andKcslIsNull() {
            addCriterion("kcsl is null");
            return (Criteria) this;
        }

        public Criteria andKcslIsNotNull() {
            addCriterion("kcsl is not null");
            return (Criteria) this;
        }

        public Criteria andKcslEqualTo(String value) {
            addCriterion("kcsl =", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslNotEqualTo(String value) {
            addCriterion("kcsl <>", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslGreaterThan(String value) {
            addCriterion("kcsl >", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslGreaterThanOrEqualTo(String value) {
            addCriterion("kcsl >=", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslLessThan(String value) {
            addCriterion("kcsl <", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslLessThanOrEqualTo(String value) {
            addCriterion("kcsl <=", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslLike(String value) {
            addCriterion("kcsl like", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslNotLike(String value) {
            addCriterion("kcsl not like", value, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslIn(List<String> values) {
            addCriterion("kcsl in", values, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslNotIn(List<String> values) {
            addCriterion("kcsl not in", values, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslBetween(String value1, String value2) {
            addCriterion("kcsl between", value1, value2, "kcsl");
            return (Criteria) this;
        }

        public Criteria andKcslNotBetween(String value1, String value2) {
            addCriterion("kcsl not between", value1, value2, "kcsl");
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
     * tb_product
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * tb_product 2018-03-25
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