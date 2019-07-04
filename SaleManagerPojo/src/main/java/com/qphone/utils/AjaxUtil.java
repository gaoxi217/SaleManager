package com.qphone.utils;

import java.io.Serializable;

/**
 * Created by 26895 on 2019/7/4.
 */
public class AjaxUtil implements Serializable{



    private String success;

    private String error;


    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
