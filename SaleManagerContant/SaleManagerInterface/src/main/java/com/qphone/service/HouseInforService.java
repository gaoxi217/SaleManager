package com.qphone.service;

import com.qphone.pojo.HouseInfor;

import java.util.List;

/**
 * Created by 高玺 on 2019/7/3.
 */

public interface HouseInforService {


    /*
      查询所有房源信息
     */
    List<HouseInfor> getAllHouse();
}
