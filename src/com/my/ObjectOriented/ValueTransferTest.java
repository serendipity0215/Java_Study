package com.my.ObjectOriented;

/**
 * @ClassName: ValueTransferTest
 * @Description: 值传递
 * @Author: ly-hulong3
 * @Date: 2022/5/5 8:14
 * @Version: v1.0
 **/
public class ValueTransferTest {
    public static void main(String[] args) {

        String s1 = "hello";

        ValueTransferTest test = new ValueTransferTest();
        test.change(s1);

        System.out.println(s1);  //hello

    }

    public void change(String s) {
        s = "hi~~";
    }
}
