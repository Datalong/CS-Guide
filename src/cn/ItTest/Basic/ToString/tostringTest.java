package cn.ItTest.Basic.ToString;


import Project02.src.bean.Customer;

import java.util.Date;

/**
 * @Auther: Datalong
 * @Date: 2021/4/9 - 04 -09 -12:27
 * @Dscription: tostring
 * @version: 1.0
 *Object的tostring源码：
 *  public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *         获取调用方法的对象的类名+@+通过hashcode算法算出hashcode值找出对象的在堆空间的地址值并用16进制打印出来
 *     }
 *
 *     自定义类可以重写tostring()方法，调用时返回对象的实体内容
 */
public class tostringTest extends Object {
    public static void main(String[] args) {

        String name;
        int age;

        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.tostring());
        System.out.println(cust1);
        /*System.out.println(cust1);*//*输出一个对象的引用= 调用引用的tostring()打印地址值*/

         String str = new String("MM");
        System.out.println(str);//重写过tostring() File类 包装类等重写object.tostring(),使得调用对象的tostring方法,返回对应实体的信息

        Date date = new Date(3435353546L);
        System.out.println(date.toString());//重写过tostring()


        System.out.println();
    }
}
