package com.my.Java5;

/**
 * @ClassName: CompareA
 * @Description: 除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法。
 * @Author: ly-hulong3
 * @Date: 2022/5/26 14:38
 * @Version: v1.0
 **/
public interface CompareA {

    // 静态方法
    public static void method1() {
        System.out.println("123");
    }

    // 默认方法
    public default void method2() {
        System.out.println("456");
    }

}
