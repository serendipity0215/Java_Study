package com.my.Array;

/*
* 对于二维数组的理解，我们可以看成是一维数组 array1 又作为另一个一维数组 array2 的元素而存在。其实，从数组底层的运行机制来看，其实没有多为数组。
* */

public class ArrayTest3 {
    public static void main(String[] args) {

        // 1. 二维数组的声明和初始化
        int[] arr = new int[]{1, 2, 3};    //   一维数组

        // 静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};

        String[][] arr2 = new String[3][2];
        String[][] arr3 = new String[3][];

        //
        int[] arr4[] = new int[][]{{1, 2, 3}, {4, 5, 1, 7}, {6, 7, 8}};

        // 2. 如何调用数组的指定位置的元素
        System.out.println("------------- 1. 输出数组指定位置的元素 --------------");

        System.out.println(arr1[0][1]); // 2
        System.out.println(arr2[1][1]); // null
        System.out.println(arr4[2][2]); //  8

        System.out.println("----------------------------------------------------\n");

        // 3. 获取数组的长度
        System.out.println("------------- 2. 输出数组的长度 --------------");
        System.out.println(arr4.length);    // 3
        System.out.println(arr4[1].length); // 2
        System.out.println("----------------------------------------------------\n");

        // 4. 如何遍历二维数组
        System.out.println("------------- 3.遍历二维数组 --------------");
        for (int i = 0; i < arr4.length; i++){

            for (int j = 0; j < arr4[i].length; j++){
                System.out.print(arr4[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------\n");

        // 5. 二维数组的元素的初始化
        /*
        * 外层元素的初始化值为：地址值
        * 内层元素的初始化值为：与一维数组初始化情况相同
        * */

        System.out.println("------------- 4.二维数组的元素的初始化 --------------");
        int[][] arr5 = new int[4][3];
        System.out.println(arr5[0]);    // [I@1b6d3586
        System.out.println(arr5[0][0]); // 0
        System.out.println(arr5);   // [[I@4554617c

        float[][] arr6 = new float[4][3];
        System.out.println(arr6[0]);    // [F@74a14482
        System.out.println(arr6[0][0]); // 0.0
        System.out.println(arr6);   // [[F@1540e19d

        System.out.println("----------------------------------------------------\n");

        // 6. 二维数组的内存解析
        System.out.println("------------- 5.二维数组的内存解析 --------------");



        System.out.println("----------------------------------------------------\n");
    }
}
