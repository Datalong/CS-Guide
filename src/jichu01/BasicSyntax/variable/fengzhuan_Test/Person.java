package jichu01.BasicSyntax.variable.fengzhuan_Test;

/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -7:59
 * @Dscription: jichu01.BasicSyntax.variable.fengzhuan_Test
 * @version: 1.0
 */
public class Person {

    private int age;

public void setAge(int a){
    if (a<0 || a>130){
        System.out.println("输入的数据非法!");
        return;
    }else{
        age = a;
    }
    }

    public int getAge(){
        return age;
    }
//两方法合二为一 两操作不可能同时执行
//    public int doAge(int a){//就变成你给别人起名 还叫别人什么名？
//        age = a;
//        return age;
//    }
}
