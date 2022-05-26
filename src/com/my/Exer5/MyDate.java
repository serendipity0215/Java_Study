package com.my.Exer5;

/**
 * @ClassName: MyDate
 * @Description: TODO
 *  包含:
 *  private 成员变量 year, month, day;
 *  toDateString()方法返回日期对应的字符串: xxxx年xx月xx日
 * @Author: ly-hulong3
 * @Date: 2022/5/25 11:11
 * @Version: v1.0
 **/
public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }
}
