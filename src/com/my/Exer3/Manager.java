package com.my.Exer3;

/**
 * @ClassName: Manager
 * @Description: TODO
 *  对于 Manager 类来说，他即使员工，还具有奖金的属性。
 * @Author: ly-hulong3
 * @Date: 2022/5/25 9:44
 * @Version: v1.0
 **/
public class Manager extends Employee {

    private double bonus; // 奖金

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行效率。");
    }


}
