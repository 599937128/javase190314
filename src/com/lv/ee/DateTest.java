package com.lv.ee;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 14zr on 2019-03-14.
 * �����ڸ�ϰ
 * uiihiu
 */
public class DateTest {
     public static void main(String args[]){
         // ��1970��1��1��0��0��0�뵽���ڵĺ���ֵ
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
