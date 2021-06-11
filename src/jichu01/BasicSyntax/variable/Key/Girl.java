package jichu01.BasicSyntax.variable.Key;

/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -9:10
 * @Dscription: jichu01.BasicSyntax.variable.Key
 * @version: 1.0
 */
public class Girl {

    private String name;
    private int age;
    Girl(){

    }

    public Girl(String girl, int i) {
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给："+boy.getName());
        boy.marry(this);//若果写成这样 构造器必须是空参 谁调marry谁就是this
    }

    //比较两个对象的大小（姑娘）正数：当前对象（调方法的）大 负数：当前对象小 0：当前对象和形参对象相等
    public int compare(Girl girl1){//对象之间如何比较大小 如：多家餐馆对象，每个餐馆对象有多个属性；先给他们排序 就看属性（当然比较地址是没有意义的（随机））
       if(this.age > girl1.age){
           return 1;
       }else if(this.age < girl1.age){
           return -1;
       }else{
           return 0;
       }

//        return this.age-girl.age;
    }
}
