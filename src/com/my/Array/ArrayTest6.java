package com.my.Array;

public class ArrayTest6 {

    public static void main(String[] args) {

        // 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，和值，平均估值，并输出出来
        // 要求：所有的随机数都是两位数 [10-99]
        int[] arr1 = new int[10];
        System.out.print("该一维数组为 arr1 = [");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random() * 90 + 10);
            System.out.print(arr1[i] + ", ");
        }
        System.out.print("]\n");

        // 1. 最大值
        int maxValue = 0;
        for (int i = 0; i < arr1.length; i++){
            if (maxValue < arr1[i]){
                maxValue = arr1[i];
            }
        }
        System.out.println("该数组中的最大值为：" + maxValue);

        // 2. 最小值
        int minValue = arr1[0];
        for (int i = 1; i < arr1.length; i++){
            if (minValue > arr1[i]){
                minValue = arr1[i];
            }
        }
        System.out.println("该数组中的最小值为：" + minValue);

        // 3. 和值
        int sumValue = 0;
        for (int i = 0; i < arr1.length; i++){
                sumValue += arr1[i];
        }
        System.out.println("该数组中的和值为：" + sumValue);

        // 4. 平均数
        int sumValue1 = 0;
        double avgValue = 0;
        for (int i = 0; i < arr1.length; i++){
                sumValue1 += arr1[i];
                avgValue = sumValue1 / (i+1);
        }
        System.out.println("该数组中的平均数为：" + avgValue);

    }
}
