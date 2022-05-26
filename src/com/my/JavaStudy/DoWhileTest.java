package com.my.JavaStudy;

/*
* do-while循环至少会执行一次循环体
* */

public class DoWhileTest {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        int count = 0;
        do {
            if (i % 2 ==0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            i++;
        }while(i <= 100);
        System.out.println("-------fengexian--------");
        System.out.println(i);
        System.out.println(sum);
        System.out.println(count);
    }
}
