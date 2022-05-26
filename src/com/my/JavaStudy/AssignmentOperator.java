package com.my.JavaStudy;

/*
* 赋值运算符:
*   =   +=  -=  *=  /=  %=
* */

public class AssignmentOperator {
    public static void main(String[] args) {
        int i1 = 10;
        int j1 = 10;

        int i2, j2;
        i2 = j2 = 10;

        int i3 = 10, j3 = 20;
        System.out.println(i1);

        i1 += i1;   // 不会改变变量本身的数据类型
        i2 -= i2;
        i3 *= i3;
        j1 /= j1;
        j2 %= 2;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(j1);
        System.out.println(j2);
    }
}
