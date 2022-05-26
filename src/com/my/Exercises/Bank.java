package com.my.Exercises;

/**
 * @ClassName: Bank
 * @Description: TODO
 * @Author: ly-hulong3
 * @Date: 2022/5/6 16:01
 * @Version: v1.0
 **/
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];   //  初始化
    }

    // 添加客户
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer++] = cust;
    }

    // 获取客户的个数
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    // 获取指定位置上的客户
    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }

}