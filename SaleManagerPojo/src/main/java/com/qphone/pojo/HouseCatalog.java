package com.qphone.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class HouseCatalog implements Serializable{
    private BigDecimal houseCatalogId;

    private String houseCatalogName;

    public BigDecimal getHouseCatalogId() {
        return houseCatalogId;
    }

    public void setHouseCatalogId(BigDecimal houseCatalogId) {
        this.houseCatalogId = houseCatalogId;
    }

    public String getHouseCatalogName() {
        return houseCatalogName;
    }

    public void setHouseCatalogName(String houseCatalogName) {
        this.houseCatalogName = houseCatalogName == null ? null : houseCatalogName.trim();
    }
}