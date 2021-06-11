package cn.ItTest.Basic.duotai;

import java.sql.Connection;

/**
 * @Auther: Datalong
 * @Date: 2021/4/6 - 04 -06 -20:01
 * @Dscription: 多态性的举例
 * @version: 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();//只要是new子类对象都是多态性
        test.func(new Dog());//new Dog用的匿名对象给了animal声明

        test.func(new Cat());

        AnimalTest test1 = new AnimalTest();
        test1.func1(new WLHG());

        AnimalTest test2 = new AnimalTest();
        test2.fun2(new Order());
    }

    public void func(Animal animal){//虽然声明了animal 但是也new Dog();  这就是一种多态性形式
        animal.eat();
        animal.shout();
    }

    public void func1(Car car){
        car.Person1();
        car.Start();
    }

    public void fun2(Order order){
        String str = null;
        order.method(str);
    }

    public void func(Dog dog){//如果没有多态性
        dog.eat();
        dog.shout();
    }

    public void func(Cat cat){
        cat.eat();
        cat.shout();
    }
}


class PLAY {
    int old = 0;
    public int basketball() {
        if (old > 18) {
            System.out.println("你已经达到打篮球的要求");
        }
        return -1;
    }
}
class Animal{

    public void eat(){
        System.out.println("动物，进食");
    }

    public void shout(){
        System.out.println("动物，叫");
    }
}

class Car{

    public void Person1(){
        System.out.println("乘客，请上车");
    }

    public void Start(){
        System.out.println("汽车已经启动");
    }
}

class WLHG extends Car{
    public void Person1(){
        System.out.println("小姐姐，快上车");
    }

    public void Start(){
        System.out.println("WLHG正在启动");
    }
}

class BMW extends Car{
    public void Person1(){
        System.out.println("小哥哥，上车");
    }

    public void Start(){
        System.out.println("BMW正在启动");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗，食骨头");
    }

    public void shout(){
        System.out.println("汪汪汪");
    }
        }

class Cat extends Animal{
    public void eat(){
        System.out.println("猫，食猫粮");
    }

    public void shout(){
        System.out.println("咪");
    }
}
//情况二
class Order{
    public void method(Object obj){//只要是object类型随便扔一个对象就行（这是多态性）所以equals形参一般放子类对象
        System.out.println("order可以打印");
    }
}
//举例三
class Driver{
    public void doData(Connection conn){//connection相当于父类的结构  添加数据以后conn = mysqlConnection() 此时调用三个方法就是重写的方法；conn=OracleConnection(); 三个方法已经重写过了
        //规范的步骤操作数据  添加数据的操作就完成了
//            conn.method1();
//            conn.method2();
//            conn.method3();


    }
}
