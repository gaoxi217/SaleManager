package com.qphone.controller;

import com.qphone.pojo.HouseInfor;
import com.qphone.service.HouseInforService;
import com.qphone.vo.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 高玺 on 2019/7/1.
 */
@RestController("/house")
public class HouseInforController {

    @Autowired(required = false)
    private HouseInforService houseInforService;

    @RequestMapping("/index")
    public House getAllHouse(){
        House house = new House();
        List<HouseInfor> list = houseInforService.getAllHouse();
        System.out.println(list.toString());
        house.setData(list);
        house.setCode(0);
        house.setCount(7);
        return house;
    }
}
