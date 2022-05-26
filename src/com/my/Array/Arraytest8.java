package com.my.Array;

/*
* 使用 java.util.Arrays 工具类
* */

import java.util.Arrays;

public class Arraytest8 {
    public static void main(String[] args) {

        // 1. equals(int[] a, int[] a2)
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,5,3,4};
        int[] arr3 = new int[]{1,2,3,4};
        boolean isEquals1 = Arrays.equals(arr1, arr2);
        boolean isEquals2 = Arrays.equals(arr1, arr3);
        System.out.println(isEquals1 + "; " + isEquals2);

        // 2. toString(int[] a)
        System.out.println(Arrays.toString(arr1));

        // 3. fill(int[] a, int val)
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));


        // 4. sort(int[] a)
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        // 5. binarySearch(int[] a, int key)


        // 空指针的情况
        int[] arr4 = new int[]{1,2,3};
        arr4 = null;
        System.out.println(arr4[0]);

    }
}
