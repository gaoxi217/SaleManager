package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class HouseInforCatalog implements Serializable{
    private BigDecimal huoseInforId;

    private BigDecimal houseCatalogId;

    public BigDecimal getHuoseInforId() {
        return huoseInforId;
    }

    public void setHuoseInforId(BigDecimal huoseInforId) {
        this.huoseInforId = huoseInforId;
    }

    public BigDecimal getHouseCatalogId() {
        return houseCatalogId;
    }

    public void setHouseCatalogId(BigDecimal houseCatalogId) {
        this.houseCatalogId = houseCatalogId;
    }
}