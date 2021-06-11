package jichu01.BasicSyntax.variable.AbstractTest;

/**
 * @Auther: Datalong
 * @Date: 2021/4/13 - 04 -13 -17:11
 * @Dscription: 关于抽象类的匿名子类的使用
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

       method(new Student()); //匿名对象（Student类)
    }

    public static void method1(Person p) {
        p.eat();
        p.walk();
    }

    public static void method(Student s) {
        System.out.println("method方法执行");
    }
}

class worker extends Person {//为什么重写？ 因为父类是抽象 子类不能抽象 那还咋创建对象

    @Override
    public void eat() {

    }
}