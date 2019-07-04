package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HouseInfor implements Serializable{
    private BigDecimal huoseInforId;

    private String huoseInforSjid;

    private String huoseInforAddr;

    private BigDecimal huoseInforStorey;

    private String huoseInforConfig;

    private BigDecimal huoseInforArea;

    private String huoseInforDescribe;

    private String houseInforPaytype;

    private String houseInforDecoration;

    private BigDecimal houseInforMoney;

    private String houseInforStatus;

    private BigDecimal houseInforLevel;

    private Date houseInforTime;

    public BigDecimal getHuoseInforId() {
        return huoseInforId;
    }

    public void setHuoseInforId(BigDecimal huoseInforId) {
        this.huoseInforId = huoseInforId;
    }

    public String getHuoseInforSjid() {
        return huoseInforSjid;
    }

    public void setHuoseInforSjid(String huoseInforSjid) {
        this.huoseInforSjid = huoseInforSjid == null ? null : huoseInforSjid.trim();
    }

    public String getHuoseInforAddr() {
        return huoseInforAddr;
    }

    public void setHuoseInforAddr(String huoseInforAddr) {
        this.huoseInforAddr = huoseInforAddr == null ? null : huoseInforAddr.trim();
    }

    public BigDecimal getHuoseInforStorey() {
        return huoseInforStorey;
    }

    public void setHuoseInforStorey(BigDecimal huoseInforStorey) {
        this.huoseInforStorey = huoseInforStorey;
    }

    public String getHuoseInforConfig() {
        return huoseInforConfig;
    }

    public void setHuoseInforConfig(String huoseInforConfig) {
        this.huoseInforConfig = huoseInforConfig == null ? null : huoseInforConfig.trim();
    }

    public BigDecimal getHuoseInforArea() {
        return huoseInforArea;
    }

    public void setHuoseInforArea(BigDecimal huoseInforArea) {
        this.huoseInforArea = huoseInforArea;
    }

    public String getHuoseInforDescribe() {
        return huoseInforDescribe;
    }

    public void setHuoseInforDescribe(String huoseInforDescribe) {
        this.huoseInforDescribe = huoseInforDescribe == null ? null : huoseInforDescribe.trim();
    }

    public String getHouseInforPaytype() {
        return houseInforPaytype;
    }

    public void setHouseInforPaytype(String houseInforPaytype) {
        this.houseInforPaytype = houseInforPaytype == null ? null : houseInforPaytype.trim();
    }

    public String getHouseInforDecoration() {
        return houseInforDecoration;
    }

    public void setHouseInforDecoration(String houseInforDecoration) {
        this.houseInforDecoration = houseInforDecoration == null ? null : houseInforDecoration.trim();
    }

    public BigDecimal getHouseInforMoney() {
        return houseInforMoney;
    }

    public void setHouseInforMoney(BigDecimal houseInforMoney) {
        this.houseInforMoney = houseInforMoney;
    }

    public String getHouseInforStatus() {
        return houseInforStatus;
    }

    public void setHouseInforStatus(String houseInforStatus) {
        this.houseInforStatus = houseInforStatus == null ? null : houseInforStatus.trim();
    }

    public BigDecimal getHouseInforLevel() {
        return houseInforLevel;
    }

    public void setHouseInforLevel(BigDecimal houseInforLevel) {
        this.houseInforLevel = houseInforLevel;
    }

    public Date getHouseInforTime() {
        return houseInforTime;
    }

    public void setHouseInforTime(Date houseInforTime) {
        this.houseInforTime = houseInforTime;
    }

    @Override
    public String toString() {
        return "HouseInfor{" +
                "huoseInforId=" + huoseInforId +
                ", huoseInforSjid='" + huoseInforSjid + '\'' +
                ", huoseInforAddr='" + huoseInforAddr + '\'' +
                ", huoseInforStorey=" + huoseInforStorey +
                ", huoseInforConfig='" + huoseInforConfig + '\'' +
                ", huoseInforArea=" + huoseInforArea +
                ", huoseInforDescribe='" + huoseInforDescribe + '\'' +
                ", houseInforPaytype='" + houseInforPaytype + '\'' +
                ", houseInforDecoration='" + houseInforDecoration + '\'' +
                ", houseInforMoney=" + houseInforMoney +
                ", houseInforStatus='" + houseInforStatus + '\'' +
                ", houseInforLevel=" + houseInforLevel +
                ", houseInforTime=" + houseInforTime +
                '}';
    }
}