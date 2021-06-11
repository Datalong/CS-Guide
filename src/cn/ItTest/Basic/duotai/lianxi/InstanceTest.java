package cn.ItTest.Basic.duotai.lianxi;

/**
 * @Auther: Datalong
 * @Date: 2021/4/10 - 04 -10 -19:05
 * @Dscription:
 * @version: 1.0
 */
public class InstanceTest {

    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();

        test.method(new Student());
    }

    public void method(Person e) {
       String info = e.getInfo();//new的是谁掉的就是谁的getinfo 这也是虚拟方法调用
        System.out.println(info);

        if (e instanceof Graduate) {
            System.out.println("graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }else if(e instanceof Student){
            System.out.println("a student");
            System.out.println("a person");
        }else {//坑定满足这个条件
            System.out.println("a person");
        }
    }
}

class Person{
    protected String name = "person";
    protected int age = 50;
    public String getInfo() {
        return "Name"+name+",age"+age;
    }
}

class Student extends Person{
    protected String school = "pku";
    public String getInfo(){
        return "Name"+name+",\nage"+age+"\nschool"+school;
    }
}

class Graduate extends Student{
    public String major = "IT";
    public String getInfo(){
        return "Name"+name+"\nage"+age+"\nschool"+school+"\nmajor"+major;
    }
}
