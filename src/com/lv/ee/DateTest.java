package com.lv.ee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 14zr on 2019-03-14.
 * 简单日期复习
 * uiihiu
 */
public class DateTest {
     public static void main(String args[]){
         // 从1970年1月1日0点0分0秒到现在的毫秒值
         System.out.println(System.currentTimeMillis());
         Date date = new Date();
         System.out.println(date);
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:ss:mm:SS");
         System.out.println(simpleDateFormat.format(new Date()));
         System.out.println("----------------------");
         System.out.println((new Date()).getTime());
         System.out.println(new Date(System.currentTimeMillis()));
     }
}
