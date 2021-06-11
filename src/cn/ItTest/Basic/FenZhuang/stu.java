package cn.ItTest.Basic.FenZhuang;

/**
 * @Auther: Datalong
 * @Date: 2021/3/10 - 03 -10 -8:00
 * @Dscription: cn.ItTest.Basic.FenZhuang
 * @version: 1.0
 */
public abstract class stu {

    public static String gender;
    public static double score;
    public static int age;

    abstract void food();

    public class Student{
        String name;
        int age;

        private int score;
        private String getName;


        public void printf(){
            System.out.println(name+"考了"+score+","+name+"今年"+age+"岁");
        }
    }
    public static void main(String[] args) {


    }
}

interface ALOTgoodJab{//接口
    void writeWell();
}

class GoodBoy implements ALOTgoodJab{

    public void writeWell(){
        System.out.println("long write Java is vary well");
    }
}

interface Dog{
    void MaoSe();
    void FurColor();
}

abstract class WhiteDog {

    public void FunColor(){
        System.out.println("this is white");
    }

    abstract void BigBody();
    abstract void SmallBody();//若果一个类中有抽象方法，那一定是抽象类 使用abstract修饰的方法一定是抽象方法

        void food(){
        System.out.println("dsds ");
    }

    void Run() {
        System.out.println("人在走路");
    }

}
