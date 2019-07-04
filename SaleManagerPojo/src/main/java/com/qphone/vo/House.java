package com.qphone.vo;

import com.qphone.pojo.HouseInfor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 高玺 on 2019/7/1.
 */
public class House implements Serializable{

    private List<HouseInfor> data;
    private  int code;
    private int count;

    public List<HouseInfor> getData() {
        return data;
    }

    public void setData(List<HouseInfor> data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
