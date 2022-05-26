package com.my.WrapperExer;

import java.util.Scanner;
import java.util.Vector;

/**
 * @ClassName: ScoreTest
 * @Description: TODO
 *  利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 *  提示：数组一旦创建，长度就固定不变，所以咋i创建数组前就需要知道它的长度。
 *  而向量类java.util.Vector可以根据需要动态伸缩。
 *
 *  创建Vector对象：
 *  给向量添加元素：
 *  取出向量中的元素：
 *  注意第一个元素的下标时0，返回值是Object类型的。
 *  计算向量的长度：
 *  若与最高分相差 10 分内 A；20分内 B；30分内C；其他D
 * @Author: ly-hulong3
 * @Date: 2022/5/18 11:10
 * @Version: v1.0
 **/
public class ScoreTest {
    public static void main(String[] args) {

        // 1.实例化Scanner，用于从键盘获取学生成绩
        Scanner scan = new Scanner(System.in);

        // 2.创建Vector对象：
        Vector v = new Vector();

        // 3.通过for(;;)方式给Vector中添加数组。
        int maxScore = 0;
            // 3.1 添加操作
            // 3.2 当输入是负数时，跳出循环
        for (;;) {
            System.out.print("请输入学生成绩（以负数代表输入结束）：");
            int score = scan.nextInt();
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("输入的数据非法，请重新输入！");
                continue;
            }
            v.addElement(score);
            // 4.获取学生成绩的最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }

        // 5.遍历Vector，得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级。
        char level;
        for (int i = 0; i <= v.size(); i++) {
            Object obj = v.elementAt(i);
            int score = (int)obj;

            if (maxScore - score <= 10) {
                level = 'a';
            } else if (maxScore - score <= 20) {
                level = 'b';
            } else if (maxScore - score <= 30) {
                level = 'c';
            } else {
                level = 'd';
            }
            System.out.println("学生：" + i + ", 的成绩是：" + score + ", 等级是：" + level);
        }
    }
}
