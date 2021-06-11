package jichu03.FanShe;

/**
 * @Auther: Datalong
 * @Date: 2021/5/24 - 05 -24 -10:53
 * @Dscription: jichu03.FanShe
 * @version: 1.0
 */
public class Person {
    public String name;
    public int age;

    public Person() {
        super();
    }

    public Person (String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String showInfo() {
        return "name="+name+",age="+age;
    }
}

class Student extends Person implements Study {
    public String className;
    private String address;

    public Student() {
        super();
    }

    public Student(String name, int age, String className, String address) {
        super(name,age);
        this.address=address;
        this.className=className;
    }

    public Student(String className){
        this.className=className;
    }

    public String toString() {
        return "姓名："+name+",年龄"+age+",班级"+className+",地址"+address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }
}
