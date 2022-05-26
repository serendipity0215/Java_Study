package com.my.Java4;

/**
 * @ClassName: InterfaceTest
 * @Description: TODO
 *  接口的使用:
 *      1. 接口使用 interface 来定义
 *      2. Java中，接口和类是并列的两个结构
 *      3. 如何定义接口: 定义接口中的成员
 *          3.1 JDK7及以前: 只能定义全局常量和抽象方法
 *              > 全局常量: public static final 的。但是书写时，可以省略不写
 *              > 抽象方法: public abstract 的
 *          3.2 JDK8: 除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法(略)
 *
 *      4. 接口中不能定义构造器的！意味着接口不可以实例化。
 *      5. Java开发中，接口通过让类去实现 (implements) 的方法使用。
 *          如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化。
 *          如果实现类没有覆盖接口中的所有的抽象方法，则此实现类仍为一个抽象类。
 *
 *      6. Java类可以实现多个接口 --> 弥补了Java单继承性的局限性
 *          格式: class AA extends BB implements CC,DD,EE
 *
 *      7. 接口与接口之间可以继承，而且可以多继承
 *      8. 接口的具体使用，体现多态性
 *      9. 接口，实际上可以看做是一种规范
 *
 * @Author: ly-hulong3
 * @Date: 2022/5/26 10:46
 * @Version: v1.0
 **/
public class InterfaceTest {
}
