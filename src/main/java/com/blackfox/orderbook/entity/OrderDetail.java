package com.blackfox.orderbook.entity;

public class OrderDetail {
    /**
     * 
     */
    private Integer id;

    /**
     * 订单编号
     */
    private String ddbh;

    /**
     * 客户编号
     */
    private String spbh;

    /**
     * 单价
     */
    private String dj;

    /**
     * 数量
     */
    private String sl;

    /**
     * 数据状态 0正常  1 删除
     */
    private String zt;

    /**
     * 状态变更时间
     */
    private String ztbgsj;

    public Product product;
    
    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 订单编号
     * @return ddbh 订单编号
     */
    public String getDdbh() {
        return ddbh;
    }

    /**
     * 订单编号
     * @param ddbh 订单编号
     */
    public void setDdbh(String ddbh) {
        this.ddbh = ddbh;
    }

    /**
     * 客户编号
     * @return spbh 客户编号
     */
    public String getSpbh() {
        return spbh;
    }

    /**
     * 客户编号
     * @param spbh 客户编号
     */
    public void setSpbh(String spbh) {
        this.spbh = spbh;
    }

    /**
     * 单价
     * @return dj 单价
     */
    public String getDj() {
        return dj;
    }

    /**
     * 单价
     * @param dj 单价
     */
    public void setDj(String dj) {
        this.dj = dj;
    }

    /**
     * 数量
     * @return sl 数量
     */
    public String getSl() {
        return sl;
    }

    /**
     * 数量
     * @param sl 数量
     */
    public void setSl(String sl) {
        this.sl = sl;
    }

    /**
     * 数据状态 0正常  1 删除
     * @return zt 数据状态 0正常  1 删除
     */
    public String getZt() {
        return zt;
    }

    /**
     * 数据状态 0正常  1 删除
     * @param zt 数据状态 0正常  1 删除
     */
    public void setZt(String zt) {
        this.zt = zt;
    }

    /**
     * 状态变更时间
     * @return ztbgsj 状态变更时间
     */
    public String getZtbgsj() {
        return ztbgsj;
    }

    /**
     * 状态变更时间
     * @param ztbgsj 状态变更时间
     */
    public void setZtbgsj(String ztbgsj) {
        this.ztbgsj = ztbgsj;
    }
}