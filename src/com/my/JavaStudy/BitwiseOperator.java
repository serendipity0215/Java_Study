package com.my.JavaStudy;

/*
* 位运算符：
*   1. 位运算符操作的都是整型的数据
*   2. <<:在一定范围内，每向左移1位，相当于 *2
*   3. >>:在一定范围内，每向右移1位，相当于 /2
*
*
*   经典面试题：最高效方式的计算 2 * 8 ？
*   2 << 3 或 8 << 1
*
* */

public class BitwiseOperator {
    public static void main(String[] args) {

        int i = 21;
        System.out.println("i << 2:" + (i << 2));  // 84 = 21 * 2*2
        System.out.println("i << 3:" + (i << 3));  // 168 = 21 * 2*2*2
        System.out.println("i << 27:" + (i << 27));  // -1476395008

    }
}
