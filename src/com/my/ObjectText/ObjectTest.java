package com.my.ObjectText;

/**
 * @ClassName: ObjectTest
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/16 10:07
 * @Version: v1.0
 **/
public class ObjectTest {

    public static void main(String[] args) {

        // 获取 Order的父类
        Order order = new Order();
        System.out.println(order.getClass());   // class com.my.ObjectText.Order
        System.out.println(order.getClass().getSuperclass());   // class java.lang.Object
    }
}

class Order {

}
