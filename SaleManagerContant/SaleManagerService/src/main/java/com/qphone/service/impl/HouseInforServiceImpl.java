package com.qphone.service.impl;

import com.qphone.dao.HouseInforLinkmanMapper;
import com.qphone.dao.HouseInforMapper;
import com.qphone.pojo.HouseInfor;
import com.qphone.pojo.HouseInforLinkman;
import com.qphone.service.HouseInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by 高玺 on 2019/7/3.
 */
@Service
public class HouseInforServiceImpl implements HouseInforService {

    @Autowired
    private HouseInforMapper houseInforMapper;

    @Autowired
    private HouseInforLinkmanMapper houseInforLinkmanMapper;

    @Override
    public List<HouseInfor> selectAllHouseByUser(Map map) {
        return houseInforMapper.selectAllHouseByUser(map);
    }

    @Override
    public HouseInfor selectByid(BigDecimal huoseInforId) {
        return houseInforMapper.selectByPrimaryKey(huoseInforId);
    }

    @Override
    public List<HouseInfor> getAllHouse() {
        return houseInforMapper.getAllHouse();
    }

    @Override
    public int deleteHouseById(BigDecimal huoseInforId) {
        return houseInforMapper.deleteByPrimaryKey(huoseInforId);
    }

    @Override
    public int deleteHouseToUser(HouseInforLinkman houseInforLinkman) {
        return 0;
    }

    @Override
    public int updateHouseById(HouseInfor huoseInfor) {
        return houseInforMapper.updateByPrimaryKeySelective(huoseInfor);
    }

    @Override
    public int insertHouse(HouseInfor record) {
        return houseInforMapper.insertSelective(record);
    }

    @Override
    public int insertHouseToUser(HouseInforLinkman houseInforLinkman) {
        return houseInforLinkmanMapper.insertSelective(houseInforLinkman);
    }


}
