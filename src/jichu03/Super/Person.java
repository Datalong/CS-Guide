package jichu03.Super;

/**
 * @Auther: Datalong
 * @Date: 2021/4/9 - 04 -09 -18:54
 * @Dscription: jichu03.Super
 * @version: 1.0
 */
public class Person {
    String name;
    int age;
    int id;//身份证号

    public Person(){
        System.out.println("我无处不在！");
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人，吃饭");
    }

    public void walk(){
        System.out.println("人，走路");
    }
}
