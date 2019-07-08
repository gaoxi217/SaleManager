package com.qphone.controller;

import com.qphone.pojo.HouseInfor;
import com.qphone.pojo.HouseInforLinkman;
import com.qphone.pojo.SysUser;
import com.qphone.service.HouseInforService;
import com.qphone.vo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 高玺 on 2019/7/3.
 */
@RequestMapping("/house")
@RestController
public class HouseInforController {

    @Autowired(required = false)
    private HouseInforService houseInforService;

    /*
    查看所有房源信息
     */
    @RequestMapping(value = "/infor",method = RequestMethod.GET)
    public House getAllHouse(HttpServletRequest request, HttpServletResponse response){


        //模拟登陆用户信息 需要用户id 角色
        SysUser sysUser = new SysUser();
        sysUser.setUserId(BigDecimal.valueOf(101));
        request.getSession().setAttribute("user",sysUser);
        request.getSession().setAttribute("role1","经理");
        request.getSession().setAttribute("role2","销售");
        SysUser user=(SysUser) request.getSession().getAttribute("user");
        String role=(String) request.getSession().getAttribute("role2");
        Map<String, Object> map = new HashMap<>();
        map.put("userId",user.getUserId());
        System.out.println("map+userid"+map.get("userId"));
        map.put("house_infor_status","正在出租");
        if(role=="经理"){
            System.out.println("select 经理 all house");
            List<HouseInfor> list = houseInforService.getAllHouse();
            House house = new House();
            house.setCount(list.size());
            house.setCode(0);
            house.setData(list);
            return house;
        }else{
            System.out.println("查询销售掌管的资源");
            List<HouseInfor> houseInfors = houseInforService.selectAllHouseByUser(map);
            House house = new House();
            house.setCount(houseInfors.size());
            house.setCode(0);
            house.setData(houseInfors);
            return house;
        }

    }


    /*
    删除指定房源
     */
    @RequestMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable(value ="id") int id,HttpServletRequest request){
        System.out.println("进入delete-id;"+id+"号房源");

        //模拟登陆用户信息 需要用户id 角色
        SysUser sysUser = new SysUser();
        sysUser.setUserId(BigDecimal.valueOf(101));
        request.getSession().setAttribute("user",sysUser);
        SysUser user=(SysUser) request.getSession().getAttribute("user");

        HouseInforLinkman houseInforLinkman = new HouseInforLinkman();
        houseInforLinkman.setHuoseInforId(BigDecimal.valueOf(id));
        houseInforLinkman.setUserId(user.getUserId());

        //首先删除销售房源关联关系
        int h= houseInforService.deleteHouseToUser(houseInforLinkman);
        if (h!=0){
            System.out.println("删除关联关系"+houseInforLinkman.getHuoseInforId()+"房屋编号"+houseInforLinkman.getUserId()+"用户编号");
        }
        //然后再删除房源信息
        int i = houseInforService.deleteHouseById(BigDecimal.valueOf(id));
        if (i==0){
            return "error";
        }else {
            return "success";
        }

    }

    /*
    新增房源
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insertHouse(@RequestBody HouseInfor houseInfor,HttpServletRequest request,HttpServletResponse response){
        System.out.println("进入新增"+houseInfor);
        //模拟登陆用户信息 需要用户id 角色
        SysUser sysUser = new SysUser();
        sysUser.setUserId(BigDecimal.valueOf(101));
        request.getSession().setAttribute("user",sysUser);
        SysUser user=(SysUser) request.getSession().getAttribute("user");

        HouseInforLinkman houseInforLinkman = new HouseInforLinkman();
        houseInforLinkman.setHuoseInforId(houseInfor.getHuoseInforId());
        houseInforLinkman.setUserId(user.getUserId());

        //首先添加房源信息
        int i = houseInforService.insertHouse(houseInfor);
        //然后添加销售与房源关联
        houseInforService.insertHouseToUser(houseInforLinkman);
        if (i==0){
            return "新增失败";
        }else {
            return "新增成功";
        }
    }

    /*
       测试弹出框 查询一个对象
        */
    @RequestMapping("/selectOne/{id}")
    public ModelAndView selectOne(@PathVariable(value = "id") int id) {
        HouseInfor houseInfor = houseInforService.selectByid(BigDecimal.valueOf(id));
        System.out.println("houseinfor"+houseInfor);
        ModelAndView view = new ModelAndView("redirect:/test/house_infor_form_edit");
        view.addObject("house",houseInfor);
        System.out.println(id+"id==========");
        return view;
    }


    /*
  修改房源信息
   */
    @RequestMapping(value = "/updata",method = RequestMethod.PUT)
    public String updataByid(@RequestBody HouseInfor houseInfor){
        System.out.println("进入修改方法");
        System.out.println("房源信息"+houseInfor);
        int i = houseInforService.updateHouseById(houseInfor);

        if (i==0){
            return "修改失败";
        }else {
            return "修改成功";
        }
    }



}
