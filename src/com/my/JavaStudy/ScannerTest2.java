package com.my.JavaStudy;

/*
*
* 要求：
*   身高：180cm以上
*   财产：1千万以上
*   颜值：帅
*
* 同时满足：嫁
* 有一个满足：勉强嫁把
* 都不满足：不嫁
*
* */

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入身高:");
        int height = scan.nextInt();
        System.out.println("请输入财富:");
        int money = scan.nextInt();
        System.out.println("请输入颜值:");
        String yz = scan.next();

        if (height > 180 && money > 1000 && yz.equals("帅")) {
            System.out.println("嫁");
        }else if (height > 180 || money > 1000 || "帅".equals(yz)) {
            System.out.println("勉强嫁把");
        }else{
            System.out.println("不嫁");
        }
    }
}
