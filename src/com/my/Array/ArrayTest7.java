package com.my.Array;

public class ArrayTest7 {
    public static void main(String[] args) {

        String[] arr = new String[]{"AA", "Bb", "CC", "DD", "gg", "ee"};
        // 查找
        // 线性查找：bb
        boolean isFlag = true;
        String dest = "bb";

        for (int i = 0; i < arr.length; i++){

            if (dest.equals(arr[i])){
                System.out.println(i);
                isFlag = false;
                break;
            }
        }
        if (isFlag == true){
            System.out.println("没有对应的bb");
        }

        // 二分法查找：前提是所要查找的数组必须是有序的
        int[] arr2 = new int[]{-98, -34, 0, 2, 34, 56,61, 90, 105, 210, 310, 400};

        int dest1 = -34;
        int head = 0;
        int end = arr2.length - 1;

        while (head <= end){
            int middle = (head + end) / 2;

            if (dest1 == arr2[middle]){
                System.out.println("找到指定元素的位置为：" + middle);
                break;
            }else if (arr2[middle] > dest1){
                end = middle - 1;
            }else if (arr2[middle] < dest1){
                head = middle + 1;
            }
        }


    }
}
