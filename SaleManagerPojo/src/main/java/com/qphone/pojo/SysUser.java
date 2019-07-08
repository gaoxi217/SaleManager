package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysUser implements Serializable{
    private BigDecimal userId;

    private String userName;

    private String userSexy;

    private String userRealname;

    private String userTel;

    private String userAddr;

    private Date userCreate;

    private  String userPass;

    private  BigDecimal xiaoshouId;

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSexy() {
        return userSexy;
    }

    public void setUserSexy(String userSexy) {
        this.userSexy = userSexy == null ? null : userSexy.trim();
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname == null ? null : userRealname.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr == null ? null : userAddr.trim();
    }

    public Date getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(Date userCreate) {
        this.userCreate = userCreate;
    }

    public BigDecimal getXiaoshouId() {
        return xiaoshouId;
    }

    public void setXiaoshouId(BigDecimal xiaoshouId) {
        this.xiaoshouId = xiaoshouId;
    }
}