package com.qphone.dao;

import com.qphone.pojo.SysRole;
import java.math.BigDecimal;

public interface SysRoleMapper {
    int deleteByPrimaryKey(BigDecimal roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(BigDecimal roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}