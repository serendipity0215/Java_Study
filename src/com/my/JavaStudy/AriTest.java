package com.my.JavaStudy;

public class AriTest {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 5;

        // 2
        int result1 = num1 / num2;
        System.out.println(result1);

        // 10
        int result2 = num1 / num2 * num2;
        System.out.println(result2);

        // 2.0
        double result3 = num1 / num2;
        System.out.println(result3);

        // 2.4
        double result4 = (double) num1 / num2;
        System.out.println(result4);

        // 2.0
        double result5 = (double) (num1 / num2);
        System.out.println(result5);
    }
}
