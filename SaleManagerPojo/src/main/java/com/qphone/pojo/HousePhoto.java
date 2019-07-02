package com.qphone.pojo;

import java.math.BigDecimal;
/**
 * Created by 高玺 on 2019/7/1.
 */
public class HousePhoto {
    private BigDecimal housePhotoId;

    private String housePhotoP1;

    private String housePhotoP2;

    private String housePhotoP3;

    private String housePhotoP4;

    public BigDecimal getHousePhotoId() {
        return housePhotoId;
    }

    public void setHousePhotoId(BigDecimal housePhotoId) {
        this.housePhotoId = housePhotoId;
    }

    public String getHousePhotoP1() {
        return housePhotoP1;
    }

    public void setHousePhotoP1(String housePhotoP1) {
        this.housePhotoP1 = housePhotoP1 == null ? null : housePhotoP1.trim();
    }

    public String getHousePhotoP2() {
        return housePhotoP2;
    }

    public void setHousePhotoP2(String housePhotoP2) {
        this.housePhotoP2 = housePhotoP2 == null ? null : housePhotoP2.trim();
    }

    public String getHousePhotoP3() {
        return housePhotoP3;
    }

    public void setHousePhotoP3(String housePhotoP3) {
        this.housePhotoP3 = housePhotoP3 == null ? null : housePhotoP3.trim();
    }

    public String getHousePhotoP4() {
        return housePhotoP4;
    }

    public void setHousePhotoP4(String housePhotoP4) {
        this.housePhotoP4 = housePhotoP4 == null ? null : housePhotoP4.trim();
    }
}