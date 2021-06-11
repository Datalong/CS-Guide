package jichu02;

import java.util.Objects;

/**
 * @Auther: Datalong
 * @Date: 2021/2/27 - 02 -27 -19:19
 * @Dscription: jichu02
 * @version: 1.0
 */
public class User {
    private String name;
    private int age;


    public User(){

    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    //重写hashcode equals
 /*   @Override
    public int hashCode() {
        return Objects.hash(name,age);//使用一下Objects类使用hash方法计算哈希值
    }
    */

  /*  private int hash(String name, int age) {
        return Objects.hash(name,age);
    }*/

    public int hashcode(String name, int age) {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        }
        if(obj==null || obj.getClass()!=this.getClass())//通过字节码是不是同一种类型
            return false;

        User user = (User)obj;//对obj向下转型
        return this.name.equals(user.name)&&this.age==user.age;//当前对象的姓名年龄和User对象姓名年龄相同 放回true 都相同的是同一个对象
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "User{"+
                "name=" + name + '\'' +
                ",age=" + age +
                        '}';
    }
}


