package com.my.JavaStudy;

/*
*  赋值运算符
*
* */

public class AriTest1 {
    public static void main(String[] args) {

        short s = 3;

        // Error:(13, 15) java: 不兼容的类型: 从int转换到short可能会有损失
        /*s = s + 2;
        System.out.println(s);*/

        // 5
        s += 2;
        System.out.println(s);


        int i = 1;

        // 0    结论：不会改变变量原本的数据类型
//        i *= 0.1;
        // 2
        i++;

        System.out.println(i);

    }
}
