package com.my.Exer5;

/**
 * @ClassName: SalariedEmployee
 * @Description: TODO
 *  继承Employee类，实现按月计算工资的员工处理。
 *  包含:
 *      private 成员变量 monthlySalary
 *      实现父类的抽象方法earnings()，该方法返回monthlySalary值; toString()方法输出员工类型信息及员工的name, number, birthday
 * @Author: ly-hulong3
 * @Date: 2022/5/25 11:27
 * @Version: v1.0
 **/
public class SalariedEmployee extends Employee {

    // 属性
    private double monthlysalary; // 月工资

    // 构造器
    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }
    public SalariedEmployee(String name, int number, MyDate birthday, double monthlysalary) {
        super(name, number, birthday);
        this.monthlysalary = monthlysalary;
    }

    // get方法
    public double getMonthlysalary() {
        return monthlysalary;
    }
    public void setMonthlysalary(double monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    @Override
    public double earnings() {
        return monthlysalary;
    }

    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}
