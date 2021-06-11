package jichu01.BasicSyntax.variable.AbstractTest;

/**
 * @Auther: Datalong
 * @Date: 2021/4/13 - 04 -13 -9:35
 * @Dscription: 开发中一定提供抽象类的构造器，便于子类实例化调用
 * 若子类重写父类的所有抽象类，让子类对象实例化，完成相关的操作
 * @version: 1.0
 */
public class  abstractTest {

    public static void main(String[] args) {
       /* Person person = new Person();*/
       /* person.eat();
        person.walk(); Person是抽象的 就是不可实例化Person*/
    }
}

 abstract class  Person {
    String name;
    int age;
    double score;

    public Person() {//这个构造器还有用？ 子类用构造器创建对象必须调用父类构造器 2类加载机制

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
  /* public void eat() {
        System.out.println("人，吃饭");
    }*/

    public abstract  void eat();

     public void walk() {
        System.out.println("人，走路");
    }
}

class Student extends Person {

    @Override
    public void eat() {

    }
}
