package com.my.Exer6;

/**
 * @ClassName: CompareableCircleTest
 * @Description: main 方法
 * @Author: ly-hulong3
 * @Date: 2022/5/26 14:19
 * @Version: v1.0
 **/
public class CompareableCircleTest {
    public static void main(String[] args) {

        CompareableCircle c1 = new CompareableCircle(3.4);
        CompareableCircle c2 = new CompareableCircle(3.2);

        int compareValue = c1.compareTo(c2);
        if (compareValue > 0) {
            System.out.println("c1对象大");
        }else if (compareValue < 0) {
            System.out.println("c2对象大");
        }else {
            System.out.println("一样大");
        }

        int compareValue1 = c1.compareTo(new String("AA"));
        System.out.println(compareValue1);
    }
}
