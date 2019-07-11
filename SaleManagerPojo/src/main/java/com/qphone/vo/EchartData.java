package com.qphone.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 26895 on 2019/7/9.
 */
public class EchartData implements Serializable{


    private List<String> legend = new ArrayList<>();

    private List<String> category = new ArrayList<>();

    private List<Series> series = new ArrayList<>();


    public EchartData(List<String> legend, List<String> category, List<Series> series) {
        this.legend = legend;
        this.category = category;
        this.series = series;
    }


    public List<String> getLegend() {
        return legend;
    }

    public void setLegend(List<String> legend) {
        this.legend = legend;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }
}
