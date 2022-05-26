package com.my.ObjectOriented;

/*
*
*
*
*
* */


public class StudentTest {
    public static void main(String[] args) {

        // 声明Student类型的数组
        Student[] stus = new Student[20];

        // 循环
        for (int i = 0; i < stus.length; i++){
            // 赋值
            stus[i] = new Student();

            // 给Student对象的属性赋值
            stus[i].number = i + 1;
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        // 遍历学生数组
        for (int i = 0; i < stus.length; i++){
            // System.out.println(stus[i].number + ";" + stus[i].state + ";" + stus[i].score);

        }

        //  打印 3年级 的学生信息
        for (int i = 0; i < stus.length; i++){
            if (stus[i].state == 3){
                System.out.println(stus[i].stuInfo());
            }
        }

        System.out.println("====================分隔符=====================");
        // 使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < stus.length - 1; i++){
            for (int j = 0; j < stus.length - 1 - i; j++){
                if (stus[j].score > stus[j + 1].score){
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < stus.length; i++){
            System.out.println(stus[i].stuInfo());
        }

    }
}

class Student{
    int number; //  学号
    int state;  //  年级
    int score;  //  成绩

    // 方法：属性赋值
    public String stuInfo(){
        return "学号：" + number + ",\t的年级是：" + state + ",\t对应的成绩是:" + score;
    }

    }