package com.my.Java5;

/**
 * @ClassName: SubClassTest
 * @Description: main 方法,程序的入口.
 * @Author: ly-hulong3
 * @Date: 2022/5/26 14:41
 * @Version: v1.0
 **/
public class SubClassTest {

    public static void main(String[] args) {
        SubClass s = new SubClass();

        /**
         * 接口中定义的静态方法, 只能通过接口来调用.
         */
        // s.method1();
        CompareA.method1();

        /**
         * 通过实现类的对象, 可以调用接口中的默认方法.
         * 如果实现类重写了接口中的默认方法, 调用时, 仍然调用的是重写以后的方法.
         * 子类重写的方法 --> 父类的同名同参数的方法 --> 接口中的默认方法
         * Tips: 如果实现类实现了多个接口，而多个接口中定义了同名同参数的默认方法, 实现类没有重写此方法的情况下, 会报错, 接口冲突. 解决办法: 在实现类中重写此方法.
         */
        s.method2();
        s.myMethod();

    }
}

class SubClass extends SuperClass implements CompareA {
    @Override
    public void method2() {
        System.out.println("789");
    }

    public void myMethod() {
        method2(); // 调用自己定义的重写的方法
        super.method2(); // 调用的是父类中的声明的
        CompareA.super.method2(); // 调用接口中的默认方法
    }
}
