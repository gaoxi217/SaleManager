package com.qphone.controller;

import com.qphone.pojo.Dept;
import com.qphone.service.IDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 高玺 on 2019/6/25.
 */
@RestController
public class IDeptController {

    @Autowired(required = false)
    private IDepService iDepService;

    @RequestMapping("/depts")
    public List<Dept> getAllDepts(){
        System.out.println("1111");
        return iDepService.getAllDepts() ;
    }
}
