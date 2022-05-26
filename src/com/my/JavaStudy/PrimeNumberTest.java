package com.my.JavaStudy;

/*
* 100以内的所有质数的输出
*
* 优化版
*
* 优化一：break
*   10万条数据（未优化前耗时：16881；    优化后耗时：1610）
*
* 优化二：根号i
*   10万条数据（未优化前耗时：16881；    优化后耗时：272）
*
* 优化一 + 优化二
*   10万条数据（未优化前耗时：16881；    优化后耗时：123）
* */

public class PrimeNumberTest {
    public static void main(String[] args) {

        boolean isFlag = true;

        // 获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start_time = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++){

            // for (int j = 2; j < i; j++){
            for (int j = 2; j < Math.sqrt(i); j++){  // 优化二：根号i
                if(i % j == 0){
                    isFlag = false;
                    break; // 优化一 此时耗时 1ms
                }
            }
            if (isFlag == true){
                System.out.print(i + ";");
            }
            //重置isFlag
            isFlag = true;
        }
        System.out.println();
        // 获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end_time = System.currentTimeMillis();
        System.out.println(end_time - start_time);
    }
}
