package com.blackfox.orderbook.entity;

public class Manufactor {
    /**
     * 
     */
    private Integer id;

    /**
     * 厂家名称
     */
    private String cjmc;

    /**
     * 厂家号码
     */
    private String cjhm;

    /**
     * 厂家地址
     */
    private String cjdz;

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
     * 厂家名称
     * @return cjmc 厂家名称
     */
    public String getCjmc() {
        return cjmc;
    }

    /**
     * 厂家名称
     * @param cjmc 厂家名称
     */
    public void setCjmc(String cjmc) {
        this.cjmc = cjmc;
    }

    /**
     * 厂家号码
     * @return cjhm 厂家号码
     */
    public String getCjhm() {
        return cjhm;
    }

    /**
     * 厂家号码
     * @param cjhm 厂家号码
     */
    public void setCjhm(String cjhm) {
        this.cjhm = cjhm;
    }

    /**
     * 厂家地址
     * @return cjdz 厂家地址
     */
    public String getCjdz() {
        return cjdz;
    }

    /**
     * 厂家地址
     * @param cjdz 厂家地址
     */
    public void setCjdz(String cjdz) {
        this.cjdz = cjdz;
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