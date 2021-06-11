package jichu03.Super;

/**
 * @Auther: Datalong
 * @Date: 2021/4/9 - 04 -09 -18:54
 * @Dscription: jichu03.Super
 * @version: 1.0
 */
public class Student extends Person{
    String major;
    int id;//学号

    public Student(){
        /*这里调用父类的空参构造器 Person()*/
    }

    public Student(String major){
        /*super() 默认调用空参构造器*/
     this.major = major;
    }

    public Student(String name,int age,String major) {
        super(name,age);//通过super调用父类指定的构造器 必须声明在子类构造器首行
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的的食物");
    }

    @Override
    public void walk() {
        System.out.println("子类人在走路");
    }

    public void study() {
        System.out.println("学生，吃透知识");
        this.eat();
        super.eat();
        super.walk();//写啥都是用的父类walk
    }

    public void show() {
        System.out.println("name= "+this.name+",age= "+super.age+",id"+super.id);//此类并没有name age  如果用省份证号必须用super 指向父类的ID
    }
}
