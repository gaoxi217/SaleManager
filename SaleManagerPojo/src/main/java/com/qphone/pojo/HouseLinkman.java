package com.qphone.pojo;

import java.math.BigDecimal;
/**
 * Created by 高玺 on 2019/7/1.
 */
public class HouseLinkman {
    private BigDecimal houseLinkmanId;

    private String houseLinkmanName;

    private String houseLinkmanRole;

    private String houseLinkmanTel;

    private String houseLinkmanOther;

    public BigDecimal getHouseLinkmanId() {
        return houseLinkmanId;
    }

    public void setHouseLinkmanId(BigDecimal houseLinkmanId) {
        this.houseLinkmanId = houseLinkmanId;
    }

    public String getHouseLinkmanName() {
        return houseLinkmanName;
    }

    public void setHouseLinkmanName(String houseLinkmanName) {
        this.houseLinkmanName = houseLinkmanName == null ? null : houseLinkmanName.trim();
    }

    public String getHouseLinkmanRole() {
        return houseLinkmanRole;
    }

    public void setHouseLinkmanRole(String houseLinkmanRole) {
        this.houseLinkmanRole = houseLinkmanRole == null ? null : houseLinkmanRole.trim();
    }

    public String getHouseLinkmanTel() {
        return houseLinkmanTel;
    }

    public void setHouseLinkmanTel(String houseLinkmanTel) {
        this.houseLinkmanTel = houseLinkmanTel == null ? null : houseLinkmanTel.trim();
    }

    public String getHouseLinkmanOther() {
        return houseLinkmanOther;
    }

    public void setHouseLinkmanOther(String houseLinkmanOther) {
        this.houseLinkmanOther = houseLinkmanOther == null ? null : houseLinkmanOther.trim();
    }
}