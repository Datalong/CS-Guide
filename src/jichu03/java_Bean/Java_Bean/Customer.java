package jichu03.java_Bean.Java_Bean;
/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -8:20
 * @Dscription: Java_Bean是一个可重用组件，也可对数据库中的表转换为Java_Bean类显示给用户
 * @version: 1.0
 */
public class Customer {

    private String name;//就像表中字段出现
   private int number;
    public Customer(){//方便我们造对象 后面通过反射来造

    }

    public void setName(String Tom){//属性的get set方法
        name = Tom;
    }

    public String getName(){
        return name;
    }

    public void setNumber(int num){
        number = num;
    }

    public int getNumber(){
        return number;
    }

    public static void main(String[] args) {

    }
}
