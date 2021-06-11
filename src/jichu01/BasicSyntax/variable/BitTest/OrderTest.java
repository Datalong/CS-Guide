package jichu01.BasicSyntax.variable.BitTest;

/**
 * @Auther: Datalong
 * @Date: 2021/4/13 - 04 -13 -8:28
 * @Dscription:
 * 对属性赋值的位置：
 * 1默认初始化
 * 2显式初始化/ 5在代码块中赋值
 * 3构造器初始化
 * 4有了对象以后，可以通过“对象，属性” 或 “对象，方法”的方式，进行赋值
 * 先后顺序：1.2/5.3.4
 * 为什么String不能被继承？
 * 实际上String里面就是char[] ,也不能在改出新花样，功能String也提供了
 *
 * static（方法区的常量池）加载要早于对象的创建； 只要权限掩允许，可以通过“对象.属性”的方式调用
 *
 * 懒，饿汉式对比：
 *饿：
 * 坏处：对象加载时间过长
 * 好处：线程安全
 * 懒：（用的多）
 * 好处：延迟对象的创建，节省内存
 * 目前坏处：线程不安全，到多线程在修改(效率差）
 * @version: 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);

        Order order1 = new Order();
        System.out.println(order1.orderId);
    }
}

class Order{

    int orderId = 3;

    {
        orderId = 4;   //4
    }

/*    {
        orderId = 4;
    }       3

    int orderId = 3;*/
    //懒汉式-》饿汉式2
Order() {

    }

    //2 声明当前类对象，没初始化 4 此对象也必须声明为static
    private static Order instance = null;//节省内存，后面再开辟

    static {//饿汉式2
        instance = new Order();
    }

    //3 声明public,static的返回当前类对象的方法
    public /*synchronized*/ static Order getInstance() {

       /* if(instance == null) {
            instance = new Order();
        }*/

        return instance;
    }
}

class Bank {//饿汉式
    private Bank() {//Bank()就不能new

    }

   /* private*/ public static final Bank Instance =  new Bank();//final让Instance不能set

    /*public static Bank getInstance() { //2种变型
        return Instance;
    }*/
}