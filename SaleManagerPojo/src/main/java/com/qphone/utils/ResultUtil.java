package com.qphone.utils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 26895 on 2019/7/3.
 */
public class ResultUtil<T> implements Serializable{

    private int code;
    private int count;
    private List<T> data;

    public ResultUtil() {
    }

    public ResultUtil(int code, int count, List<T> data) {
        this.code = code;
        this.count = count;
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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
