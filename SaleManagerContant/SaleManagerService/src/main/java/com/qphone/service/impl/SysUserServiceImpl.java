package com.qphone.service.impl;

import com.qphone.dao.SysUserMapper;
import com.qphone.dao.UserRoleMapper;
import com.qphone.pojo.SysUser;
import com.qphone.service.ISysUserService;
import com.qphone.utils.AjaxUtil;
import com.qphone.utils.ResultUtil;
import com.qphone.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 26895 on 2019/7/3.
 */

@Service
public class SysUserServiceImpl implements ISysUserService{


    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;





    @Override
    public ResultUtil<Member> getMember(SysUser user) {

        int role = sysUserMapper.selectRoleByUser(user);

        System.out.println(role);

        Map<String, Object> map = new HashMap<>();



        ResultUtil<Member> result = null;

        if(role==1){
            //经理
            map.put("roleId", BigDecimal.valueOf(1));

            result = new ResultUtil<>(0,getCount(map), sysUserMapper.selectAll());

        }else if(role==2){
            //销售

            map.put("userId", BigDecimal.valueOf(101));//销售人员的id

            result = new ResultUtil<>(0,getCount(map), sysUserMapper.selectByUser(user));

        }

        return result;
    }

    @Override
    public ResultUtil<Member> getXiaoShou() {

        Map<String, Object> map = new HashMap<>();
        map.put("roleId", BigDecimal.valueOf(2));

        return new ResultUtil<>(0,getCount(map), sysUserMapper.selectAllXiaoShou());

    }

    @Override
    public int getCount(Map<String, Object> map) {

        return sysUserMapper.selectCount(map);

    }

    @Override
    public AjaxUtil delUser(BigDecimal userId) {


        AjaxUtil ajax = new AjaxUtil();


        if(userRoleMapper.delete(userId)==1){

            if(sysUserMapper.deleteByPrimaryKey(userId)==1){

                ajax.setSuccess("success");
            }else {
                ajax.setError("error");
            }

        }



        return ajax;
    }
}
