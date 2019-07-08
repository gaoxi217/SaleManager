package com.qphone.dao;

import com.qphone.pojo.HouseInforLinkman;

public interface HouseInforLinkmanMapper {
    int insert(HouseInforLinkman record);

    /*
    给指定销售添加房源
     */
    int insertSelective(HouseInforLinkman record);

    /*
    删除销售关联房源
     */
    int deleteHouseToUser(HouseInforLinkman record);
}