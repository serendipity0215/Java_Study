package com.my.Wrapper;

import org.junit.Test;

/**
 * @ClassName: InterviewTest
 * @Description: 关于包装类使用的面试题
 * @Author: ly-hulong3
 * @Date: 2022/5/18 10:24
 * @Version: v1.0
 **/
public class InterviewTest {

    @Test
    public void test1() {
        Object o1 = true ? new Integer(1) : new Double(2.2);
        System.out.println(o1); // 1.0
    }

    @Test
    public void test2() {
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.3);
        System.out.println(o2); // 1
    }

    @Test
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // false

        /**
         * Integer内部定义了IntegerCache结构，IntegerCache中定义了Inter[]，
         * 保存了从 -128 ~ 127 范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在 -128 ~ 127 范围内时，可以直接使用数组中的元素，不用再去new了。
         * 目的：提高效率。
         */
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); // true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false
    }
}
