package jichu01.BasicSyntax.variable.Key;

import jichu01.BasicSyntax.variable.fengzhuan_Test.Person;

/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -8:43
 * @Dscription: jichu01.BasicSyntax.variable.Key
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();

                p1.setAge(17);
        System.out.println("年龄是："+p1.getAge());
    }

}

class Perosn{

    private String name;
    private int age;

    public void setName(String name){
        name = this.name;//this后面是属性 不重名可以不用写this
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){//形参的意义就是给属性赋值
        age = this.age;
    }
    public int getAge(){
        return age;
    }

}
