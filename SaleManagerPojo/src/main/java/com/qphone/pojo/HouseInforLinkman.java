package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class HouseInforLinkman implements Serializable{
    private BigDecimal huoseInforId;

    private BigDecimal userId;

    public BigDecimal getHuoseInforId() {
        return huoseInforId;
    }

    public void setHuoseInforId(BigDecimal huoseInforId) {
        this.huoseInforId = huoseInforId;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }
}