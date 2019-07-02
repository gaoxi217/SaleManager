package com.qphone.pojo;

import java.math.BigDecimal;

public class HouseCatalog {
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