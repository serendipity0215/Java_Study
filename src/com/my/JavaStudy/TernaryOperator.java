package com.my.JavaStudy;

/*
* 《三元运算符》
*
*   1. 结构：（条件表达式）？ 表达式1：表达式2
*
*   2. 说明：
*       ① 条件表达式的结果为boolean类型
*       ② 根据条件表达式真或假，决定执行表达式1，还是表达式2
*       ③ 三元运算符可以嵌套使用
*
* */
public class TernaryOperator {
    public static void main(String[] args) {

        // 获取两个整数的较大值
        int m = 12;
        int n = 5;

        int max = (m > n)? m : n;
        System.out.println(max);

        double max2 = (m > n)? 1 : 2.0;
        System.out.println(max2);

        String maxStr = (m > n)? "m大" : "n大";
        System.out.println(maxStr);
    }
}
