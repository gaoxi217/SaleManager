package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrdersHouse implements Serializable{
    private BigDecimal ordersId;

    private BigDecimal huoseInforId;

    public BigDecimal getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(BigDecimal ordersId) {
        this.ordersId = ordersId;
    }

    public BigDecimal getHuoseInforId() {
        return huoseInforId;
    }

    public void setHuoseInforId(BigDecimal huoseInforId) {
        this.huoseInforId = huoseInforId;
    }
}