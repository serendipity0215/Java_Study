package com.my.Array;

public class ArrayTest4 {
    public static void main(String[] args) {

        int[][] arr1 = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

        // 获取arr1数组中的所有的元素的和
        int sum1 = 0;

        for (int i = 0; i < arr1.length; i++){

            for (int j = 0; j < arr1[i].length; j++){
                sum1 += arr1[i][j];

            }
        }
        System.out.println("arr1数组中所有元素的和：" + sum1);

    }
}
