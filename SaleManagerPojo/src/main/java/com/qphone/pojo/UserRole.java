package com.qphone.pojo;

import java.math.BigDecimal;

public class UserRole {
    private BigDecimal userId;

    private BigDecimal roleId;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }
}