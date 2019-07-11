package com.qphone.service.impl;

import com.qphone.dao.SysUserMapper;
import com.qphone.dao.UserRoleMapper;
import com.qphone.pojo.SysUser;
import com.qphone.pojo.UserRole;
import com.qphone.service.ISysUserService;
import com.qphone.utils.AjaxUtil;
import com.qphone.utils.GeneratId;
import com.qphone.utils.Page;
import com.qphone.utils.ResultUtil;
import com.qphone.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 26895 on 2019/7/3.
 */

@Service
public class SysUserServiceImpl implements ISysUserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;


    @Override
    public SysUser selectByName(String name) {
        return sysUserMapper.selectByName(name);
    }

    /*
        传入一个SysUser，如果是经理，则查出所有的房东和租客。
        如果是销售，则查出与此销售有关的房东和租客。
         */
    @Override
    public ResultUtil<Member> getMember(SysUser user, Page page) {

        int role = sysUserMapper.selectRoleByUser(user);

        System.out.println(role);

        Map<String, Object> map = new HashMap<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("user", user);
        map1.put("page", page);

        ResultUtil<Member> result = null;

        if (role == 1) {
            //经理
            map.put("roleId", BigDecimal.valueOf(1));

            result = new ResultUtil<>(0, getCount(map), sysUserMapper.selectAll(page));

        } else if (role == 2) {
            //销售

            map.put("userId", BigDecimal.valueOf(101));//销售人员的id

            result = new ResultUtil<>(0, getCount(map), sysUserMapper.selectByUser(map1));

        }

        return result;
    }

    @Override
    public ResultUtil<Member> getXiaoShou(Page page) {

        Map<String, Object> map = new HashMap<>();
        map.put("roleId", BigDecimal.valueOf(2));

        return new ResultUtil<>(0, getCount(map), sysUserMapper.selectAllXiaoShou(page));

    }

    @Override
    public int getCount(Map<String, Object> map) {

        return sysUserMapper.selectCount(map);

    }

    @Override
    public AjaxUtil delUser(BigDecimal userId) {


        AjaxUtil ajax = new AjaxUtil();


        if (userRoleMapper.delete(userId) == 1) {

            if (sysUserMapper.deleteByPrimaryKey(userId) == 1) {

                ajax.setSuccess("success");
            } else {
                ajax.setError("error");
            }

        }


        return ajax;
    }


    @Override
    public AjaxUtil addUser(Member member) {

        UserRole userRole = new UserRole();

        AjaxUtil ajaxUtil = new AjaxUtil();
        BigDecimal userid = GeneratId.getRandomId();

        SysUser user = new SysUser();

        user.setUserId(userid);
        user.setUserCreate(new Date());
        user.setUserName(member.getUserName());
        user.setUserRealname(member.getUserRealname());
        user.setUserAddr(member.getUserAddr());
        user.setUserSexy(member.getUserSexy());
        user.setUserTel(member.getUserTel());

        if (!"租客".equals(member.getRoleName())) {
            if (sysUserMapper.insertSelective(user) == 1) {
                ajaxUtil.setSuccess("success");
            }

            userRole.setUserId(userid);
        }

        if ("经理".equals(member.getRoleName())) {
            userRole.setRoleId(BigDecimal.valueOf(1));
            userRoleMapper.insert(userRole);

        } else if ("销售".equals(member.getRoleName())) {
            userRole.setRoleId(BigDecimal.valueOf(2));
            userRoleMapper.insert(userRole);

        } else if ("房东".equals(member.getRoleName())) {
            userRole.setRoleId(BigDecimal.valueOf(3));
            userRoleMapper.insert(userRole);

        } else if ("租客".equals(member.getRoleName())) {

            user.setXiaoshouId(BigDecimal.valueOf(101));
            if (sysUserMapper.insertSelective(user) == 1) {
                ajaxUtil.setSuccess("success");
            }

            userRole.setUserId(userid);

            userRole.setRoleId(BigDecimal.valueOf(4));
            userRoleMapper.insert(userRole);

        }

        return ajaxUtil;
    }


    @Override
    public AjaxUtil updateUser(Member member) {

        AjaxUtil ajaxUtil = new AjaxUtil();

        SysUser user = new SysUser();

        user.setUserId(member.getUserId());
        user.setUserName(member.getUserName());
        user.setUserRealname(member.getUserRealname());
        user.setUserAddr(member.getUserAddr());
        user.setUserSexy(member.getUserSexy());
        user.setUserTel(member.getUserTel());

        if (sysUserMapper.updateByPrimaryKeySelective(user) == 1) {
            ajaxUtil.setSuccess("success");
        }

        return ajaxUtil;
    }
}
