package com.my.JavaStudy;

import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入xx的成绩：");
        double mark = scan.nextDouble();

        if (mark == 100) {
            System.out.println("奖励一辆BMW！");
        } else if (mark > 80 && mark <= 99) {
            System.out.println("奖励一台iphone xs max！");
        } else if (mark >= 60 && mark <= 80) {
            System.out.println("奖励一个ipad！");
        } else{
            System.out.println("nothing！");
        }
    }
}
