package com.qphone.service.impl;

import com.qphone.dao.HouseInforMapper;
import com.qphone.pojo.HouseInfor;
import com.qphone.service.HouseInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 高玺 on 2019/7/1.
 */
@Service
public class HouseInforServiceImpl implements HouseInforService {

    @Autowired
    private HouseInforMapper houseInforMapper;
    @Override
    public List<HouseInfor> getAllHouse() {
        return houseInforMapper.getAllHouse();
    }
}
