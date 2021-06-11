package cn.ItTest.Basic.duotai.lianxi;

/**
 * @Auther: Datalong
 * @Date: 2021/4/10 - 04 -10 -18:41
 * @Dscription: 多态面试题
 * @version: 1.0
 */
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s  = new Sub();
        System.out.println(s.count);
        s.display();
        Base b = s;//类型可以转换
        System.out.println(b == s);//比较地址值
        System.out.println(b.count);
        b.display();//子父类都有的方法，调用就是子类的方法，叫做虚拟方法调用 子父类中最好不要出现相同的属性（同名就蒙了）
    }
}

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
