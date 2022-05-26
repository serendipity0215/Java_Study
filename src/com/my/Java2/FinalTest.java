package com.my.Java2;

/**
 * @ClassName: FinalTest
 * @Description: TODO
 *
 *  final: 最终的
 *      1. final 可以用来修饰的结构: 类、方法、变量
 *      2. final 用来修饰一个类: 此类不能被其他类所继承。比如: String类、System类、StringBuffer类。
 *      3. final 用来修饰一个方法: 此方法不能被重写。比如: Object类中getClass()。
 *      4. final 用来修饰一个变量: 此时的 "变量" 就称为一个 常量。
 *          4.1 可以考虑赋值的位置有: 显示初始化、代码块中初始化、构造器中初始化。
 *          4.2 修饰局部变量: 尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。一旦生成以后，就只能在方法体内使用此形参，但不能进行重新赋值。
 *
 * @Author: ly-hulong3
 * @Date: 2022/5/24 9:28
 * @Version: v1.0
 **/
public class FinalTest {
}
