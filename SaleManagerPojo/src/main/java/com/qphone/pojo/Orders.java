package com.qphone.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private BigDecimal ordersId;

    private String ordersSjid;

    private String ordersName;

    private BigDecimal ordersMoney;

    private Date ordersTime;

    public BigDecimal getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(BigDecimal ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersSjid() {
        return ordersSjid;
    }

    public void setOrdersSjid(String ordersSjid) {
        this.ordersSjid = ordersSjid == null ? null : ordersSjid.trim();
    }

    public String getOrdersName() {
        return ordersName;
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName == null ? null : ordersName.trim();
    }

    public BigDecimal getOrdersMoney() {
        return ordersMoney;
    }

    public void setOrdersMoney(BigDecimal ordersMoney) {
        this.ordersMoney = ordersMoney;
    }

    public Date getOrdersTime() {
        return ordersTime;
    }

    public void setOrdersTime(Date ordersTime) {
        this.ordersTime = ordersTime;
    }
}