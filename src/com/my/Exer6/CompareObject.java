package com.my.Exer6;

/**
 * @ClassName: CompareObject
 * @Description: 创建一个 interface，比较两个值，若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小
 * @Author: ly-hulong3
 * @Date: 2022/5/26 14:03
 * @Version: v1.0
 **/
public interface CompareObject {
    /**
     * 若返回值是0,代表相等; 若为正数,代表当前对象大; 若为负数代表当前对象小.
     */
    public int compareTo(Object o);
}
