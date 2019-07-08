package com.qphone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;


/**
 * Created by 高玺 on 2019/6/27.
 */
@RequestMapping("test")
@Controller()
public class IndexController {

    @RequestMapping("{url}")
    public String index(@PathVariable("url") String url){
        System.out.println(url+"url....");

        return url;
    }


}
