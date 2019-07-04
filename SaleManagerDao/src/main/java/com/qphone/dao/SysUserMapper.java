package com.qphone.dao;

import com.qphone.pojo.SysUser;
import com.qphone.vo.Member;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface SysUserMapper {


    /*
    跟据销售人员查出所有相关联的房东与租客信息
     */
    List<Member> selectByUser(SysUser user);

    /*
    查出所有的房东与租客信息
     */
    List<Member> selectAll();

    /*
    根据用户查出其角色
     */
    int selectRoleByUser(SysUser user);

    /*
    查出所有销售和经理信息
     */
    List<Member> selectAllXiaoShou();


    int selectCount(Map<String,Object> map);


    //增
    int insertSelective(SysUser record);
    //删
    int deleteByPrimaryKey(BigDecimal userId);
    //改
    int updateByPrimaryKeySelective(SysUser record);










    int insert(SysUser record);


    SysUser selectByPrimaryKey(BigDecimal userId);

    int updateByPrimaryKey(SysUser record);
}