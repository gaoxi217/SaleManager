package com.qphone.dao;

import com.qphone.pojo.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}