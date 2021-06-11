package jichu02;
//泛型：数据类型的参数化 好处：1用在集合中，限制存储的元素的类型，不用再使用元素的时候，逐个元素进行类型检查；2提高可读性；
//在使用这个类的时候，必须要指定泛型的类型，如果不指定，默认是object; 在类中定义的泛型，虽然不明确是什么类型，但是在当前类中是可以使用的
//泛型，只能在当前的类中受用，不能在其他类中使用，包括子类。
/*
* Animal<String> animal; //声明变量
* Animal<Integer> animal = new Animal<>(); //实例化对象
* Animal <Integer>.display(); //访问静态成员
*
* class Dog extends Animal<String> {} //被继承
* class Dog<T> extends Animal<T> {}
*
*  */

/**
 * @Auther: Datalog
 * @Date: 2021/2/16 - 02 -16 -7:58
 * @Dscription: fichu02
 * @version: 1.0
 */

class Students{
    private String school;
    private Double grade;
}

class  Worker{
    public int ID;
    String address;
}

class Person<T>{
    String name;
    int age;
    T part;

    public int bigAge() {
       return this.age + 10;
    }
}

class Student extends Person<String>{//Student子类没有使用泛型，它继承父类需要指定父类的类型
    Person<String> p1 = new Person();

}
class Teacher<E> extends Person<E>{
    Person<String> p2 = new Person<>();
}

class Tool<E>{
    private E obj;
    public void setObj(Students obj){
         this.obj = (E) obj;
    }
    public E getObj(){
        return obj;
    }
    public void Tool() {
        System.out.println(this.toString());
    }
}

interface MyInterface1<T>{
    int compareTo(T o1, T o2);
}

interface SumMyInterface extends MyInterface1<Integer>{}

class Person01{
    int age;
    private String address;
}

class MyDemo implements MyInterface1<Person01>{//1）定义接口的子类
    @Override
    public int compareTo(Person01 O1, Person01 O2){
        return O1.age- O2.age;
    }
}
public class faxing_demo {
    public static void main(String[] args) {//3泛型可以把运行时的问题转移到编译上
        Tool<Student> tool = new Tool<>();//后面类型可以省略

        tool.setObj(new Students());
        tool.Tool();

        //Worker worker = (E)tool.getObj();//直接使用Worker会不兼容 E会提高安全性


        Person<String> ren = new Person<>();
        ren.part="eat";//指定的String

        Student stu = new Student();
        stu.part = "66";

        Teacher<Integer> teacher = new Teacher<>();//在使用时可以不指定泛型 object是什么类型都可以接受
        teacher.part=88;


        MyInterface1<Person01> myInterface1 = new MyInterface1<Person01>() {//2） 匿名内部类
            @Override
            public int compareTo(Person01 o1, Person01 o2) {
                return o1.age- o2.age;
            }
        };

        MyInterface1<Person01> myInterface12 = (o1, o2) -> o1.age- o2.age;
        MyInterface1<String> myInterface13 =  (o1, o2) -> o1.length()-o2.length();
    }
}
