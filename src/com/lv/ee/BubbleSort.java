package com.lv.ee;

import java.util.Arrays;

/**
 * Created by 14zr on 2019-03-14.
 * �����㷨
 */
public class BubbleSort {
     public static void main(String args[]){
         bubbleTest();
         add100And200();
         addAndMul();
         getNumbes();
      }
    // ð������
    public static void bubbleTest() {
        int [] num = {100,34,2,32,6,56,7};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1;j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
    // 100 ��200  �ĺ�
    public static void add100And200() {
        int s = 0;
        for (int i = 100; i<=200; i++) {
            s += i;
        }
        System.out.println(s);
    }

    //1�ӵ�20 �Ľ׳�
    public static void addAndMul() {
        int addNum = 0;
        int num = 1;
        for (int i = 1; i <= 20; i++) {
            num *= i;
            addNum += num;
        }
        System.out.println(addNum);
    }
    // ������1��100�Ŀ��Ա�3,7,5��������
    public static void getNumbes() {
        for (int i = 1; i <= 1000; i++){
            if (i %3 == 0 && i%7 == 0 && i % 5 ==0) {
                System.out.print(i+ "--");
            }
        }
    }

}
