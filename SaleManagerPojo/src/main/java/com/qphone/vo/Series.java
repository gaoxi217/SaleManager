package com.qphone.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 26895 on 2019/7/9.
 */
public class Series implements Serializable{

    private String name;

    private String type;

    private List<Integer> data;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }


    public Series(String name, String type, List<Integer> data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }


    public Series() {
    }


    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
