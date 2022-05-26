package com.my.JavaStudy;

/*
* While 循环
* */

public class WhileTest {
    public static void main(String[] args) {

        // 遍历100以内的所有偶数
        int i = 1;
        while(i <= 100){

            if (i % 2 ==0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);
    }
}
