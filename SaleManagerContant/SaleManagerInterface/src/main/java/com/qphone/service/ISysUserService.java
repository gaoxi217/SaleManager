package com.qphone.service;

import com.qphone.pojo.SysUser;
import com.qphone.utils.AjaxUtil;
import com.qphone.utils.ResultUtil;
import com.qphone.vo.Member;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by 26895 on 2019/7/3.
 */
public interface ISysUserService {



    ResultUtil<Member> getMember(SysUser user);



    ResultUtil<Member> getXiaoShou();



    int getCount(Map<String, Object> map);



    AjaxUtil delUser(BigDecimal userId);




}
