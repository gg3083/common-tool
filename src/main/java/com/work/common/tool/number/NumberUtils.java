package com.work.common.tool.number;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Gimi
 * @date 2020-10-24 15:17
 */
public class NumberUtils {


    public static Long numMultiply100(long num){
        return num * 100;
    }

    public static Long numMultiply10000(long num){
        return num * 10000;
    }

    public static Long numMultiply10000(BigDecimal num){
        return num.multiply(BigDecimal.valueOf(10000L)).longValue();
    }

    public static Long numMultiply10000(String num){
        BigDecimal bigDecimal = new BigDecimal(num);
        return bigDecimal.multiply(new BigDecimal(10000)).longValue();
    }

    public static Long numDivide100(long num){
        return num / 100;
    }

    public static Long numDivide10000(long num){
        return num / 10000;
    }

    public static BigDecimal numDivideByBigDecimal10000(long num){
        BigDecimal bigDecimal = new BigDecimal(num);
        return bigDecimal.divide(new BigDecimal(10000L),2, RoundingMode.HALF_UP);
    }

    public static Long numDivideFormat4(Long num){
        if (num < 10000L){
            return 0L;
        }
        String str = num.toString();
        return Long.parseLong(str.substring(0,str.length()-4));
    }

    public static Long numDivideFormat4(String str){
        return Long.parseLong(str.substring(0,str.length()-4));
    }


    public static Long roundFormat(BigDecimal bigDecimal){
        BigDecimal divide = bigDecimal.divide(BigDecimal.valueOf(10000L), 0, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(10000L));
        return divide.longValue();
    }

    public static void main(String[] args) {
        BigDecimal val = BigDecimal.valueOf(1209100L);
        System.err.println(roundFormat(val));
    }
}
