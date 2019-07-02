package com.qphone.dao;

import com.qphone.pojo.HouseLinkman;
import java.math.BigDecimal;

public interface HouseLinkmanMapper {
    int deleteByPrimaryKey(BigDecimal houseLinkmanId);

    int insert(HouseLinkman record);

    int insertSelective(HouseLinkman record);

    HouseLinkman selectByPrimaryKey(BigDecimal houseLinkmanId);

    int updateByPrimaryKeySelective(HouseLinkman record);

    int updateByPrimaryKey(HouseLinkman record);
}