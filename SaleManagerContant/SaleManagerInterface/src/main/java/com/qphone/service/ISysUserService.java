package com.qphone.service;

import com.qphone.pojo.SysUser;
import com.qphone.utils.AjaxUtil;
import com.qphone.utils.Page;
import com.qphone.utils.ResultUtil;
import com.qphone.vo.Member;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by 26895 on 2019/7/3.
 */
public interface ISysUserService {

    //根据用户名查询对象
    SysUser selectByName(String name);


    ResultUtil<Member> getMember(SysUser user, Page page);



    ResultUtil<Member> getXiaoShou(Page page);



    int getCount(Map<String, Object> map);



    AjaxUtil delUser(BigDecimal userId);


    AjaxUtil addUser(Member member);


    AjaxUtil updateUser(Member member);


}
