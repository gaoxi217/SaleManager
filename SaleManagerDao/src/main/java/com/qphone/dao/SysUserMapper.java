package com.qphone.dao;

import com.qphone.pojo.SysUser;
import com.qphone.utils.Page;
import com.qphone.vo.Member;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface SysUserMapper {


    /*
    以销售的身份登录，查出所有与此销售有关的 房东 和 租客
     */
    List<Member> selectByUser(Map<String,Object> map);







    /*
    以经理的身份登录，查出所有的 房东 和 租客
     */
    List<Member> selectAll(Page page);

    /*
    传入一个 SysUser对象  返回 一个此用户的角色值
               1    经理
               2    销售
               3    房东
               4    租客
     */
    int selectRoleByUser(SysUser user);

    /*
    以经理的身份登录  查出所有的 经理 和 销售
     */
    List<Member> selectAllXiaoShou(Page page);






    /*
    传入一个 map 对象
            key         value
            userId
            roleId

            如果userId 的值不为 null
               （ 以销售的身份登录，查出所有与此销售有关的 房东 和 租客 ） 的总数量
            如果userId 的值为 null
                如果roleId 为 1
                    （ 以经理的身份登录，查出所有的 房东 和 租客 ） 的总数量
                如果roleId 为 2
                    （ 以经理的身份登录，查出所有的 经理 和 销售 ） 的总数量
     */
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