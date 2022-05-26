package com.my.JavaStudy;

import java.util.Scanner;

public class SwitchCaseTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("输入年：");
        int year = scan.nextInt();
        System.out.println("输入月：");
        int month = scan.nextInt();
        System.out.println("输入日：");
        int day = scan.nextInt();

        // 定义一个变量来保存天数
        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    sumDays += 29;
                }else{
                    sumDays += 28;
                }
            case 2:
                sumDays += 30;
            case 1:
                sumDays += day;
        }
        System.out.println(year + "年" + month + "月" + day + "日" + "是当年的第" + sumDays + "天");
    }
}
