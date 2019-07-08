package com.qphone.utils;

import java.io.Serializable;

/**
 * Created by 26895 on 2019/7/8.
 */
public class Page implements Serializable{



    private int end;

    private int start;


    public Page(int page, int limit) {
        this.end = page*limit;
        this.start = ((page-1)*limit)+1;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
