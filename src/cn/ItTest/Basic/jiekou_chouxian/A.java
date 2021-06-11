package cn.ItTest.Basic.jiekou_chouxian;

/**
 * @Auther: Datalong
 * @Date: 2021/3/8 - 03 -08 -20:32
 * @Dscription: cn.ItTest.Basic.jiekou_chouxian
 * @version: 1.06
 */
public class A extends C{
    public static void main(String[] args) {
    A test = new A();
    C.string();
    //test.toString();
    printMessage();

    }

    static void printMessage(){
        System.out.println("long is writing article");

    }
}

class C{
    static String name = "long";
    static Integer age = 18;
    final String name1 = "tian";
    private double height = 1.78;

    static void string(){

        System.out.println(name);
    }
}


