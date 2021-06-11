package jichu03.java_Bean.fengzhuang.encapsulation;

/**
 * @Auther: Datalong
 * @Date: 2021/3/1 - 03 -01 -18:54
 * @Dscription: jichu03.java_Bean.fengzhuang.encapsulation
 * @version: 1.0
 */
public class Student {
    String name;
    String gender;
    double score;
    public void introduce(){
        System.out.println("我叫"+name+"是"+gender+"考了"+score+"分");
    }

}
