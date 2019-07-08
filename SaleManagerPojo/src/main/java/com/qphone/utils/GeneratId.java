package com.qphone.utils;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by 26895 on 2019/7/5.
 */
public class GeneratId {


    public static BigDecimal getRandomId(){

        long millis = System.currentTimeMillis();

        Random random = new Random();

        int end2 = random.nextInt(99);

        String str = millis + String.format("%02d", end2);

        long id = new Long(str);

        return BigDecimal.valueOf(id);

    }














}
