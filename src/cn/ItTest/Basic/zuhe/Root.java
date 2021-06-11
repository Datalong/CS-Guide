package cn.ItTest.Basic.zuhe;

/**
 * @Auther: Datalong
 * @Date: 2021/3/2 - 03 -02 -13:43
 * @Dscription: 组合：就是将对象引用放到新类（提高复用性） 多用组合 少用继承
 * @version: 1.0
 */
public class Root{
    private static int age;
    private String name;

    public static void main(String[] args) {
        new Leaf();
    }
    static{
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的非静态初始化块");
    }

     public Root(){
        System.out.println("Root的无参的构造器");
    }

    public Root(int age, String name) {
        System.out.println("Root的有参构造器");
    }
}

class Mid extends Root{
    static{
        System.out.println("Mid的静态初始块");
    }
    {
        System.out.println("Mid的普通初始块");
    }
    public Mid(){
        System.out.println("Mid的无参的构造器");
    }
    public Mid(String msg) {
        this();//调同类中重载的构造器
        System.out.println("Mid的带参数构造器，其参数值："+msg);
    }
}

class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始块");
    }
    {
        System.out.println("Leaf的普通初始块");
    }
    public Leaf(){
        super("long");
        System.out.println("Leaf的构造器");
    }
}
