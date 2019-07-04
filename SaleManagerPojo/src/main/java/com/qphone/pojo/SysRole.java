package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class SysRole implements Serializable{
    private BigDecimal roleId;

    private String roleName;

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}