package com.qphone.dao;

import com.qphone.pojo.UserOrders;

public interface UserOrdersMapper {
    int insert(UserOrders record);

    int insertSelective(UserOrders record);
}