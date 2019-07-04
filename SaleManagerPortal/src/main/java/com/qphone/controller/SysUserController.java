package com.qphone.controller;

import com.qphone.pojo.SysUser;
import com.qphone.service.ISysUserService;
import com.qphone.utils.AjaxUtil;
import com.qphone.utils.ResultUtil;
import com.qphone.vo.Member;
import org.apache.zookeeper.data.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by 26895 on 2019/7/3.
 */
@RestController
public class SysUserController {


    @Autowired(required = false)
    private ISysUserService iSysUserService;


    @RequestMapping("/Sysuser_getmember")
    public ResultUtil<Member> getMember(){
        SysUser user = new SysUser();
        user.setUserId(BigDecimal.valueOf(100));
        return iSysUserService.getMember(user);
    }



    @RequestMapping("/Sysuser_getXiaoShou")
    public ResultUtil<Member> getXiaoShou(){
        return iSysUserService.getXiaoShou();
    }





    @RequestMapping(value = "/Sysuser_del/{userId}",method = RequestMethod.DELETE)
    public AjaxUtil del(@PathVariable("userId") BigDecimal userId){

        return iSysUserService.delUser(userId);

    }











}
