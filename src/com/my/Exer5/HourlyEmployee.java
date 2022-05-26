package com.my.Exer5;

/**
 * @ClassName: HourlyEmployee
 * @Description: TODO
 *  参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的员工处理。
 *  包含:
 *      private 成员变量 wage, hour
 *      实现父类的抽象方法 earnings(), 该方法返回 wage * hour值。
 *      toString()方法输出员工类型信息及员工的 name, number, birthday。
 * @Author: ly-hulong3
 * @Date: 2022/5/25 11:36
 * @Version: v1.0
 **/
public class HourlyEmployee extends Employee{

    private int wage; // 每小时的工资
    private int hour; // 月工作的小时数

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }
    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}
