package com.qphone.controller;

import com.qphone.pojo.SysUser;
import com.qphone.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 高玺 on 2019/7/11.
 */
@RequestMapping("/login")
@RestController
public class LoginController {
    @Autowired(required = false)
    private ISysUserService iSysUserService;
    /*
    根据用户名查询用户对象
     */

    @RequestMapping("/user")
    public String login(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");
        System.out.println("username"+userName+"password"+userPass);
        SysUser user = iSysUserService.selectByName(userName);
        System.out.println(user.getUserPass()+"user....");
        if(user!=null){
            if(user.getUserPass()==userPass){
                System.out.println("登陆成功");
                return "/test/index";
            }else {
                return "密码错误";
            }
        }else {
            return "用户名不存在";
        }

    }
}
