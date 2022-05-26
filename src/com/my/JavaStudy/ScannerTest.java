package com.my.JavaStudy;

/*
*
* 调用Scanner类的相关方法，来获取指定类型的变量
* */

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的性别");
        String gender = scan.next();
        System.out.println(gender);

        System.out.println("请输入你的年龄");
        double nn = scan.nextDouble();
        System.out.println(nn);

    }
}
