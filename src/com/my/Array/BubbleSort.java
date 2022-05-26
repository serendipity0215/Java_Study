package com.my.Array;

/*
* 衡量排序算法的优劣：
* 1. 时间复杂度：分析关键字的比较次数和记录的移动次数
* 2. 空间复杂度：分析排序算法中需要多少辅助内存
* 3. 稳定性：若两个记录 A 和 B 的关键字值相等，但排序后 A、B 的先后次序保持不变，则称这种排序算法是稳定的。
* */

public class BubbleSort {
    public static void main(String[] args) {

        // 冒泡排序
        int[] arr = new int[]{43, 23, 0, -78, -30, 98, 78, 21, 32, 100, -1};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("冒泡排序：");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ";");
        }


        // 快速排序





    }
}
