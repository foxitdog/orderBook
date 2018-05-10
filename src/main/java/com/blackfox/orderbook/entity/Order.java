package com.blackfox.orderbook.entity;

public class Order {
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
    private String khbh;

    /**
     * 订单金额
     */
    private String ddje;

    /**
     * 优惠金额
     */
    private String yhje;

    /**
     * 订单状态
     */
    private String ddzt;

    /**
     * 数据状态 0正常  1 删除
     */
    private String zt;

    /**
     * 状态变更时间
     */
    private String ztbgsj;

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
     * @return khbh 客户编号
     */
    public String getKhbh() {
        return khbh;
    }

    /**
     * 客户编号
     * @param khbh 客户编号
     */
    public void setKhbh(String khbh) {
        this.khbh = khbh;
    }

    /**
     * 订单金额
     * @return ddje 订单金额
     */
    public String getDdje() {
        return ddje;
    }

    /**
     * 订单金额
     * @param ddje 订单金额
     */
    public void setDdje(String ddje) {
        this.ddje = ddje;
    }

    /**
     * 优惠金额
     * @return yhje 优惠金额
     */
    public String getYhje() {
        return yhje;
    }

    /**
     * 优惠金额
     * @param yhje 优惠金额
     */
    public void setYhje(String yhje) {
        this.yhje = yhje;
    }

    /**
     * 订单状态
     * @return ddzt 订单状态
     */
    public String getDdzt() {
        return ddzt;
    }

    /**
     * 订单状态
     * @param ddzt 订单状态
     */
    public void setDdzt(String ddzt) {
        this.ddzt = ddzt;
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