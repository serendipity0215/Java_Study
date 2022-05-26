package com.my.JavaStudy;

/*
* 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
*
* 说明:
*   1. 不在循环条件部分限制次数的结构： for(;;) 或 while(true)
*   2. 结束循环的几种方式？
*       方式一：循环条件部分返回 false
*       方式二：在循环体中，执行 break
* */

import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positiveNum = 0; // 记录正数的个数
        int negativeNum = 0; // 记录负数的个数

        while(true) {
            int num = sc.nextInt();

            // 判断num的正负情况
            if (num > 0){
                positiveNum++;
            }else if(num < 0){
                negativeNum++;
            }else{
                // 一旦执行break，跳出循环
                break;
            }
        }

        System.out.println("正数个数：" + positiveNum);
        System.out.println("负数个数：" + negativeNum);
    }
}

