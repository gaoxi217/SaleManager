package com.qphone.dao;

import com.qphone.pojo.Orders;
import java.math.BigDecimal;

public interface OrdersMapper {














    int deleteByPrimaryKey(BigDecimal ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(BigDecimal ordersId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}