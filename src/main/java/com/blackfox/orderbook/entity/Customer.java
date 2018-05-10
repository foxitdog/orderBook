package com.blackfox.orderbook.entity;

public class Customer {
    /**
     * 
     */
    private Integer id;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 电话号码
     */
    private String dhhm;

    /**
     * 手机号码
     */
    private String sjhm;

    /**
     * 住址
     */
    private String zj;

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
     * 姓名
     * @return xm 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * 电话号码
     * @return dhhm 电话号码
     */
    public String getDhhm() {
        return dhhm;
    }

    /**
     * 电话号码
     * @param dhhm 电话号码
     */
    public void setDhhm(String dhhm) {
        this.dhhm = dhhm;
    }

    /**
     * 手机号码
     * @return sjhm 手机号码
     */
    public String getSjhm() {
        return sjhm;
    }

    /**
     * 手机号码
     * @param sjhm 手机号码
     */
    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    /**
     * 住址
     * @return zj 住址
     */
    public String getZj() {
        return zj;
    }

    /**
     * 住址
     * @param zj 住址
     */
    public void setZj(String zj) {
        this.zj = zj;
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