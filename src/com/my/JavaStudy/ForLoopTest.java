package com.my.JavaStudy;

/*
*
* 循环语句的四个组成部分：
*   1. 初始化部分    init_statement
*   2. 循环条件部分   test_exp
*   3. 循环体部分    body_statement
*   4. 迭代部分 alter_statement
*
* */


public class ForLoopTest {
    public static void main(String[] args) {
        for (int i  = 1; i < 5; i++){
            System.out.println("Hello World!");
        }

        int num = 1;
        for (System.out.print("a"); num <= 3; System.out.print ("c"), num++){
            System.out.print("b");
        }

        System.out.println("\n-------------------- 这是分割线 --------------------");

        // 遍历100以内的偶数
        for (int i = 1; i < 100; i++){
            if (i % 2 == 0){
                System.out.print(i + ",");
            }
        }
    }
}
