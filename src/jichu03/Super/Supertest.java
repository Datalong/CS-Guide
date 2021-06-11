package jichu03.Super;

/**
 * @Auther: Datalong
 * @Date: 2021/4/9 - 04 -09 -18:52
 * @Dscription:
 * @version: 1.0
 */
public class Supertest {
    public static void main(String[] args) {

        Student s = new Student();
        s.show();

        System.out.println();
        s.study();
        s.walk();

        Student s1 = new Student("Tom",21,"IT");
        s1.show();

        System.out.println("*****************");
        //Student d = new Student();//相当于调用Student()
        Student e = new Student(s.major);
    }
}
