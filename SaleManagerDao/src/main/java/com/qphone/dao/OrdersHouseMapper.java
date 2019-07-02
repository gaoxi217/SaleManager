package com.qphone.dao;

import com.qphone.pojo.OrdersHouse;

public interface OrdersHouseMapper {
    int insert(OrdersHouse record);

    int insertSelective(OrdersHouse record);
}