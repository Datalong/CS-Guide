package jichu01.BasicSyntax.variable;

/**
 * @Auther: Datalong
 * @Date: 2021/3/1 - 03 -01 -6:19
 * @Dscription: jichu01.BasicSyntax.variable
 * @version: 1.0
 */
public class Demogouzao {
    private String name;
    private int age;

        public Demogouzao(){
            System.out.println("构造第一次执行");//构造方法调用
        }

    public Demogouzao(String name,int age){
        System.out.println("构造第二次执行");
        this.name = name;
        this.age = age;
    }
    //如何获取name age
    public void setName(String name){
            this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
            this.age=age;
    }

    public int getAge(){
            return age;
    }
}
