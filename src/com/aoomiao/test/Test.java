package com.aoomiao.test;

import java.math.BigDecimal;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* <p>
* create by AooMiao on 2018-07-02
*/
public class Test {

    public static void main(String[] args) throws ParseException {
        /*for (int i = 0; i < 3; i++) {
            if(i==1){
                throw new RuntimeException("error");
            }
            System.out.println(i);
        }*/
        Double a = 0.05D;
        Double b = 0.01D;
        BigDecimal c = new BigDecimal(Double.toString(a));
        BigDecimal d = new BigDecimal(Double.toString(b));
        System.out.println(c.add(d).doubleValue());
    }

}
