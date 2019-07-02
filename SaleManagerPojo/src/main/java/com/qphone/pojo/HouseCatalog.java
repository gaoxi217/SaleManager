package com.qphone.pojo;

import java.math.BigDecimal;
/**
 * Created by 高玺 on 2019/7/1.
 */
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