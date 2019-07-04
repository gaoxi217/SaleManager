package com.qphone.dao;

import com.qphone.pojo.UserRole;

import java.math.BigDecimal;

public interface UserRoleMapper {

    //增
    int insert(UserRole record);

    //删
    int delete(BigDecimal userId);










    int insertSelective(UserRole record);






}