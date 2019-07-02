package com.qphone.dao;

import com.qphone.pojo.SysUser;
import java.math.BigDecimal;

public interface SysUserMapper {
    int deleteByPrimaryKey(BigDecimal userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(BigDecimal userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}