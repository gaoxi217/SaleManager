package com.qphone.dao;

import com.qphone.pojo.HouseInfor;

import java.math.BigDecimal;
import java.util.List;

public interface HouseInforMapper {

    /*
    根据id查询一个对象
     */
    HouseInfor selectByPrimaryKey(BigDecimal huoseInforId);

    /*
    多条件查询:id,addr,关联的销售人员
     */
    HouseInfor selectByAddr(String addr);


    /*
   新增房源信息
    */
    int insertSelective(HouseInfor record);


    /*
      查询所有房源信息
     */
    List<HouseInfor> getAllHouse();

    /*
    根据指定id删除房源信息
     */
    int deleteByPrimaryKey(BigDecimal huoseInforId);

    /*
    修改指定房源信息
     */
    int updateByPrimaryKeySelective(HouseInfor record);



    int insert(HouseInfor record);

    int updateByPrimaryKey(HouseInfor record);
}