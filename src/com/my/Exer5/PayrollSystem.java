package com.my.Exer5;

import java.util.Calendar;

/**
 * @ClassName: PayrollSystem
 * @Description: TODO
 *  创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。利用循环结构 遍历数组元素，输出各个对象的类型，
 *      name, number, birthday
 *      以及该对象的生日。当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @Author: ly-hulong3
 * @Date: 2022/5/25 11:51
 * @Version: v1.0
 **/
public class PayrollSystem {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH); // 获取当前的月份 注意: 一月输出结果为 0

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("zozo", 1001, new MyDate(1992, 4, 16), 10000);
        emps[1] = new HourlyEmployee("hul", 1002, new MyDate(1991, 10, 11), 60, 240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            double salary = emps[i].earnings();
            System.out.println("月工资为: " + salary);

            if ( ++month == emps[i].getBirthday().getMonth()) {
                System.out.println("生日快乐！ 奖励100Yuan。");
            }
        }
    }

}
