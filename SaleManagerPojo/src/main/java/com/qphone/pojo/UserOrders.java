package com.qphone.pojo;

import java.math.BigDecimal;

public class UserOrders {
    private BigDecimal userId;

    private BigDecimal ordersId;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(BigDecimal ordersId) {
        this.ordersId = ordersId;
    }
}