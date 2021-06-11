package cn.ItTest.Basic.daili;

import java.util.Scanner;

/**
 * @Auther: Datalong
 * @Date: 2021/5/22 - 05 -22 -10:34
 * @Dscription: cn.ItTest.Basic.daili
 * @version: 1.0
 */
public class sta extends Boss implements student {
    private int ID;
    public String position;
    public static double salary;
    public int age;

    public double calculate_meals() {
        System.out.println("你的饭钱一共是：");
        return 0;
    }
}

class Boss {

}

interface student {

}
 class Test {
     public static void main(String[] args) {
         System.out.println("渐渐走近档口，来了老弟，你看想吃点什么？");
         Scanner s = new Scanner(System.in);

     }
 }
