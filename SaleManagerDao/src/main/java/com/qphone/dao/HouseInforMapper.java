package com.qphone.dao;

import com.qphone.pojo.HouseInfor;
import java.math.BigDecimal;

public interface HouseInforMapper {
    int deleteByPrimaryKey(BigDecimal huoseInforId);

    int insert(HouseInfor record);

    int insertSelective(HouseInfor record);

    HouseInfor selectByPrimaryKey(BigDecimal huoseInforId);

    int updateByPrimaryKeySelective(HouseInfor record);

    int updateByPrimaryKey(HouseInfor record);
}