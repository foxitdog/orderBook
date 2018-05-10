package com.blackfox.orderbook.entity;

public class Product {
    /**
     * 
     */
    private Integer id;

    /**
     * 型号
     */
    private String xh;

    /**
     * 名称
     */
    private String mc;

    /**
     * 类型
     */
    private String lx;

    /**
     * 厂家
     */
    private String cj;

    /**
     * 原价
     */
    private String yj;

    /**
     * 单价
     */
    private String dj;

    /**
     * 最低单价
     */
    private String zddj;

    /**
     * 库存数量
     */
    private String kcsl;

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
     * 型号
     * @return xh 型号
     */
    public String getXh() {
        return xh;
    }

    /**
     * 型号
     * @param xh 型号
     */
    public void setXh(String xh) {
        this.xh = xh;
    }

    /**
     * 名称
     * @return mc 名称
     */
    public String getMc() {
        return mc;
    }

    /**
     * 名称
     * @param mc 名称
     */
    public void setMc(String mc) {
        this.mc = mc;
    }

    /**
     * 类型
     * @return lx 类型
     */
    public String getLx() {
        return lx;
    }

    /**
     * 类型
     * @param lx 类型
     */
    public void setLx(String lx) {
        this.lx = lx;
    }

    /**
     * 厂家
     * @return cj 厂家
     */
    public String getCj() {
        return cj;
    }

    /**
     * 厂家
     * @param cj 厂家
     */
    public void setCj(String cj) {
        this.cj = cj;
    }

    /**
     * 原价
     * @return yj 原价
     */
    public String getYj() {
        return yj;
    }

    /**
     * 原价
     * @param yj 原价
     */
    public void setYj(String yj) {
        this.yj = yj;
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
     * 最低单价
     * @return zddj 最低单价
     */
    public String getZddj() {
        return zddj;
    }

    /**
     * 最低单价
     * @param zddj 最低单价
     */
    public void setZddj(String zddj) {
        this.zddj = zddj;
    }

    /**
     * 库存数量
     * @return kcsl 库存数量
     */
    public String getKcsl() {
        return kcsl;
    }

    /**
     * 库存数量
     * @param kcsl 库存数量
     */
    public void setKcsl(String kcsl) {
        this.kcsl = kcsl;
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