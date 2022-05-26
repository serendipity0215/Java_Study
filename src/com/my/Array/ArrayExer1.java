package com.my.Array;

public class ArrayExer1 {

    public static void main(String[] args) {

        int[] array1;
        int[] array2;

        array1 = new int[]{2,3,5,7,11,13,17,19};

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + "\t");
        }

        System.out.println();

        // array1, array2地址值相同，都指向了堆空间的唯一的一个数组实体
        array2 = array1;
        for (int i = 0; i < array2.length; i++){
            if (i % 2 == 0){
                array2[i] = i;
            }
        }
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + "\t");
        }

        System.out.println();

        // 复制
        int[] array3, array4;

        array3 = new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + "\t");
        }
        System.out.println();
        array4 = new int[array3.length];
        for (int i = 0; i < array4.length; i++){
            array4[i] = array3[i];
            System.out.print(array4[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array4.length; i++){
            if (i % 2 == 0){
                array4[i] = i;
            }
        }
        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array4.length; i++){
            System.out.print(array4[i] + "\t");
        }

    }
}
