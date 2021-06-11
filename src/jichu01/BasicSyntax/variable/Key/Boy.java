package jichu01.BasicSyntax.variable.Key;

/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -8:58
 * @Dscription: jichu01.BasicSyntax.variable.Key
 * @version: 1.0
 */
public class Boy {
    private String name;
    private int age;
    private String yanzhi;

    public Boy(){

    }

    public Boy(String name){
        this.name = name;
    }

    public Boy(String name, int age){
        this.name= name;
        this.age = age;
    }

    public Boy(String name, int age, String yanzhi){

    }

    public void setName(String name){
        name = this.name;
    }

    public String getName(){
        return name;
    }

    public void setYanzhi(String yanzhi){
        yanzhi = this.yanzhi;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶："+girl.getName());
    }

    public void RIPE(Boy boy, Girl girl){
        if(age >= 0){
            System.out.println("懂得都懂");
        }else if(name == "刘兴"){
            System.out.println("嫖客石锤");
        }else{
            System.out.println("其他人都是好人");
        }
    }

    public void shout(){
        if(age >= 22){
            System.out.println("你可以合法登记了");
        }else{
            System.out.println("先多谈一谈恋爱");
        }
    }
}
