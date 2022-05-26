package com.my.Array;

/*
* 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
*   成绩 >= 最高分 - 10  等级为 'A'
*   成绩 >= 最高分 - 20  等级为 'B'
*   成绩 >= 最高分 - 30  等级为 'C'
*   其余                 等级为 'D'
*
* */

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {

        // 1. 使用Scanner，读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int num = scanner.nextInt();

        // 2. 创建数组，存储学生成绩：动态初始化
        int[] score = new int[num];

        // 3. 给数组中的元素赋值
        System.out.println("请输入" + num + "个学生成绩：");
        for (int i = 0; i < score.length; i++){
            score[i] = scanner.nextInt();
        }

        // 4. 获取数组中的元素的最大值
        int maxScore = 0;
        for (int i = 0; i < score.length; i++){
            if(maxScore < score[i]){
                maxScore = score[i];
            }
        }

        // 5. 根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        String level;
        for (int i = 0; i < score.length; i++){
            if (maxScore - score[i] <= 10){
                level = "A";
            }else if (maxScore - score[i] <= 20){
                level = "B";
            }else if (maxScore - score[i] <= 30){
                level = "C";
            }else{
                level = "D";
            }
            System.out.println("学生:" + i + ", 成绩:" + score[i] + ", 等级: " + level);
        }

    }
}
