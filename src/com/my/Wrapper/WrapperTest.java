package com.my.Wrapper;

import org.junit.Test;

/**
 * @ClassName: WrapperTest
 * @Description: 包装类的使用
 * @Author: ly-hulong3
 * @Date: 2022/5/18 9:33
 * @Version: v1.0
 **/
public class WrapperTest {

    /**
     * 基本数据类型 转 包装类
     */
    @org.junit.Test
    public void test1() {
        int num1 = 10;
        System.out.println(num1);   // 10

        Integer in1 = new Integer(num1);
        System.out.println(in1.toString()); // 10

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1); // 12.3
        System.out.println(f2); // 12.3

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("True12");
        System.out.println(b1); // true
        System.out.println(b2); // false

        Order order = new Order();
        System.out.println(order.isMale);   // false
        System.out.println(order.isFemale); // null
    }

    /**
     * 包装类 转 基本数据类型：调用包装的 Value()
     */
    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1); // 12

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2); // 12.3
    }

    /**
     * 基本数据类型、包装类 ---> String类型：调用String重载的valueOf()
     */
    @Test
    public void test3() {

        int num1 = 10;
        // 通过连接运算符的方式实现转换
        String str1 = num1 + "";
        System.out.println(str1);   //  10

        // 通过String的valueOf()
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str2);   // 12.3

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str3);   // 12.4

    }

    /**
     * String类型 ---> 基本数据类型、包装类:调用包装类的parseXxx()
     */
    @Test
    public void test4() {
        String str1 = "123";
        String str2 = "true12";
        int num2 = Integer.parseInt(str1);
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(num2);   // 123
        System.out.println(b1);     // false

    }


}

class Order {
    boolean isMale;
    Boolean isFemale;
}