package com.qphone.controller;

import com.qphone.vo.EchartData;
import com.qphone.vo.Series;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 26895 on 2019/7/9.
 */

@RestController
public class EchartsController {




    @RequestMapping(value = "/echarts",method = RequestMethod.POST)
    public EchartData get(){

        List<String> legend = new ArrayList<String>(Arrays.asList(new String[]{"销售总额"}));//数据分组
        List<String> category = new ArrayList<String>(Arrays.asList(new String []{"小王","小李","小天","小刘","小美","小七","小语"}));//横坐标
        List<Series> series = new ArrayList<Series>();//纵坐标

        series.add(new Series("销售总额", "value",new ArrayList<Integer>(Arrays.asList(21,23,28,26,21,33,44))));
        EchartData data=new EchartData(legend, category, series);



        return data;
    }




    @RequestMapping(value = "/echartsone",method = RequestMethod.POST)
    public EchartData getone(){

        List<String> legend = new ArrayList<String>(Arrays.asList(new String[]{"销售总额"}));//数据分组
        List<String> category = new ArrayList<String>(Arrays.asList(new String []{"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"}));//横坐标
        List<Series> series = new ArrayList<Series>();//纵坐标

        series.add(new Series("销售总额", "value",new ArrayList<Integer>(Arrays.asList(21,23,28,26,21,33,44))));
        EchartData data=new EchartData(legend, category, series);



        return data;
    }



















}
