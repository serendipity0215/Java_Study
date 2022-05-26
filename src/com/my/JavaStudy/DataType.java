package com.my.JavaStudy;
/*
    Java定义的数据类型

    一、变量按照数据类型来分：

        基本数据类型：
            整型：byte、short、int、long
            浮点型：float、double
            字符型：char
            布尔型：boolean

        引用数据类型：
            类：class
            接口：interface
            数组：array


    二、变量在类中声明的位置：
            成员变量 vs 局部变量
 */



public class DataType {
    public static void main(String[] args){
        // 1. 整型： byte（1字节 = 8bit）、short（2字节）、int（4字节）、long（8字节）
        // ① byte范围：-128 ~ 127
        byte b1 = 12;
        byte b2 = -128;

        System.out.println(b1);
        System.out.println(b2);

        // ② 声明long型变量，必须以“l”或“L”结尾
        // ③ 通常，定义整型变量时，使用int型
        short s1 = 128;
        int i1 = 1234;
        long l1 = 123123123L;

        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
    }
}
