package com.qphone.service.impl;

import com.qphone.dao.IDeptDao;
import com.qphone.pojo.Dept;
import com.qphone.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 高玺 on 2019/6/25.
 */
@Service
public class DeptServiceImpl implements IDepService {

    @Autowired
    private IDeptDao iDeptDao;
    @Override
    public List<Dept> getAllDepts() {
        return iDeptDao.getAllDepts();
    }
}
