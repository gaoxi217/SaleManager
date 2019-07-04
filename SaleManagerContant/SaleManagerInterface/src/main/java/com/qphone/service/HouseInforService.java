package com.qphone.service;

import com.qphone.pojo.HouseInfor;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 高玺 on 2019/7/3.
 */

public interface HouseInforService {

    /*
    根据id查询一个对象
     */
    HouseInfor selectByid(BigDecimal huoseInforId);

    /*
      查询所有房源信息
     */
    List<HouseInfor> getAllHouse();

    /*
    删除指定id房源
     */
    int deleteHouseById(BigDecimal huoseInforId);

    /*
    修改表单提交对象
     */
    int updateHouseById(HouseInfor huoseInfor);

    /*
    新增房源信息
     */
    int insertHouse(HouseInfor record);
}
