package com.my.Exer6;

/**
 * @ClassName: CompareableCircle
 * @Description: 定义一个 CompareableCircle 类, 继承 Circle 类并实现 CompareObject 接口.
 *               在 CompareableCircle 类中给出接口中方法 compareTo 的实现体, 用来比较两个圆的半径大小.
 * @Author: ly-hulong3
 * @Date: 2022/5/26 14:11
 * @Version: v1.0
 **/
public class CompareableCircle extends Circle implements CompareObject {

    public CompareableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof CompareableCircle) {
            CompareableCircle c = (CompareableCircle)o;
            if (this.getRadius() > c.getRadius()) {
                return 1;
            }else if (this.getRadius() < c.getRadius()) {
                return -1;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
    }
}
