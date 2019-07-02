package com.qphone.dao;

import com.qphone.pojo.HousePhoto;
import java.math.BigDecimal;

public interface HousePhotoMapper {
    int deleteByPrimaryKey(BigDecimal housePhotoId);

    int insert(HousePhoto record);

    int insertSelective(HousePhoto record);

    HousePhoto selectByPrimaryKey(BigDecimal housePhotoId);

    int updateByPrimaryKeySelective(HousePhoto record);

    int updateByPrimaryKey(HousePhoto record);
}