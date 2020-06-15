package com.feerate;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author yang bingkun
 * create on 2020/6/10
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(16);

        map.put("mFee", 1086);
        map.put("eFee", 1032);

        map.put("mFee", 1086);
        map.put("eFee", 1032);

        int[] num = {52,821,506,351,650,445,875,313,616,260,739,556,295,650,126,43,376,201,262,682,228,303,515,82,345,402,640,586,353,138,325,1324,35,612,668,626,196,280,326,304,352,258,413,41,};
//        num[0] = new Double(2);  //通过下标把1.9变为2.0
        int sum = 0;
        double sumPFee = 0;
        for (int value : num) {
//            System.out.println(value);
            sum += value;  //求和
            double v = value * 0.85;
//            System.out.println(v);
            sumPFee += v;  //求和
        }
        System.out.println("原价： " + sum);
        String pFee = String.format("%.2f", sumPFee);
        System.out.println("折后： " + sumPFee);
        System.out.println("折后： " + pFee);
    }
}
