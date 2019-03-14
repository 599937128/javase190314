package com.lv.ee;

import java.util.Arrays;

/**
 * Created by 14zr on 2019-03-14.
 * 简单的String的复习
 */
public class StringTest {
     public static void main(String args[]){
         String s1 = new String("love");
         String s2 = "love you";
         System.out.println(s1.charAt(1));
         System.out.println(s1.replace("o", "l"));
         System.out.println(s1);
         String [] sp1 = s1.split("v");
         System.out.println(Arrays.toString(sp1));
         System.out.println(s1.substring(2));
         System.out.println(s1.substring(0, 1));
         System.out.println(s1.toUpperCase());
         //查看是否包含
         System.out.println(s1.startsWith("l"));
         System.out.println(s1.endsWith("v"));
         System.out.println(s1.contains("v"));
         System.out.println(s1.concat("sss"));
     }
}
