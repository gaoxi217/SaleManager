package com.qphone.controller;

import com.qphone.pojo.HouseInfor;
import com.qphone.service.HouseInforService;
import com.qphone.vo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

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
    public House getAllHouse(){
        System.out.println("select  all house");
        List<HouseInfor> list = houseInforService.getAllHouse();
        House house = new House();
        house.setCount(9);
        house.setCode(0);
        house.setData(list);
        return house;
    }
    /*
    根据id查询一个对象
     */
    @RequestMapping(value = "/selectOne/{id}",method = RequestMethod.GET)
    public HouseInfor selectOne(@PathVariable(value="id") int id){
        System.out.println("查询一个对象");
        HouseInfor houseInfor = houseInforService.selectByid(BigDecimal.valueOf(id));
        System.out.println("houseinfor"+houseInfor);
        return houseInfor;
    }

    /*
    删除指定房源
     */
    @RequestMapping(value = "/delete/{id}")
    public String deleteById(@PathVariable(value ="id") int id){
        System.out.println("进入delete-id;"+id+"号房源");
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
    public String insertHouse(@RequestBody HouseInfor houseInfor){
        System.out.println("进入新增");
        int i = houseInforService.insertHouse(houseInfor);
        if (i==0){
            return "新增失败";
        }else {
            return "新增成功";
        }
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



    /*
    测试弹出框
     */
    @RequestMapping("/test")
    public String test(){
        return "house_infor_form";
    }
}
