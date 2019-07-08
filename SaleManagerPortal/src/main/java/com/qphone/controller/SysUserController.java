package com.qphone.controller;

import com.qphone.pojo.SysUser;
import com.qphone.service.ISysUserService;
import com.qphone.utils.AjaxUtil;
import com.qphone.utils.Page;
import com.qphone.utils.ResultUtil;
import com.qphone.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;

/**
 * Created by 26895 on 2019/7/3.
 */
@RestController
public class SysUserController {


    @Autowired(required = false)
    private ISysUserService iSysUserService;


    @RequestMapping("/Sysuser_getmember")
    public ResultUtil<Member> getMember(@RequestParam int page,@RequestParam int limit){
        SysUser user = new SysUser();
        Page p = new Page(page,limit);
        user.setUserId(BigDecimal.valueOf(101));
        return iSysUserService.getMember(user,p);
    }


    @RequestMapping("/Sysuser_getXiaoShou")
    public ResultUtil<Member> getXiaoShou(@RequestParam int page,@RequestParam int limit){

        Page p = new Page(page,limit);
        return iSysUserService.getXiaoShou(p);
    }


    @RequestMapping(value = "/Sysuser_del/{userId}",method = RequestMethod.DELETE)
    public AjaxUtil del(@PathVariable("userId") BigDecimal userId){

        return iSysUserService.delUser(userId);

    }


    @RequestMapping(value = "/Sysuser_add",method = RequestMethod.POST)
    public AjaxUtil addUser(@RequestBody Member member){


        return iSysUserService.addUser(member);
    }



    @RequestMapping(value = "/Sysuser_update",method = RequestMethod.PUT)
    public AjaxUtil UpdateUser(@RequestBody Member member){
        System.out.println(member);
        return iSysUserService.updateUser(member);
    }
























}
