package com.my.ObjectOriented;

/*
* 优化封装
* */

public class StudentTest1 {
    public static void main(String[] args) {

        // 声明Student类型的数组
        Student1[] stus = new Student1[20];

        // 循环
        for (int i = 0; i < stus.length; i++){
            // 赋值
            stus[i] = new Student1();

            // 给Student对象的属性赋值
            stus[i].number = i + 1;
            stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            stus[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        StudentTest1 test = new StudentTest1();
        //  1. 遍历
        test.stuPrint(stus);
        System.out.println("====================分隔符=====================");
        //  2. 打印 3年级 的学生信息
        test.stuSearchState(stus, 3);
        System.out.println("====================分隔符=====================");
        // 3. 使用冒泡排序按学生成绩排序，并遍历所有学生信息
        test.stuSort(stus);

    }

    // 方法二：遍历
    public void stuPrint(Student1[] stus){
        for (int i = 0; i < stus.length; i++){
            System.out.println(stus[i].stuInfo());
        }
    }

    // 方法三： 打印 3年级 的学生信息
    public void stuSearchState(Student1[] stus, int state){
        for (int i = 0; i < stus.length; i++){
            if (stus[i].state == state){
                System.out.println(stus[i].stuInfo());
            }
        }
    }

    // 方法四：
    // 使用冒泡排序按学生成绩排序，并遍历所有学生信息
    public void stuSort(Student1[] stus){
        for (int i = 0; i < stus.length - 1; i++){
            for (int j = 0; j < stus.length - 1 - i; j++){
                if (stus[j].score > stus[j + 1].score){
                    Student1 temp = stus[j];
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


class Student1{
    int number; //  学号
    int state;  //  年级
    int score;  //  成绩

    // 方法一：属性赋值
    public String stuInfo() {
        return "学号：" + number + ",\t的年级是：" + state + ",\t对应的成绩是:" + score;
    }
}