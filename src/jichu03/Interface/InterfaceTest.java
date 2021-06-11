package jichu03.Interface;
/**
 * @Auther: Datalong
 * @Date: 2021/4/8 - 04 -08 -16:53
 * @Dscription: 接口的初步使用
 * @version: 1.0
 * JDK7及之前：
 * 只能定义全局常量和抽象方法
 * >全局常量： public static final的(书写时可省略）
 * >抽象方法：public abstract的
 * JDK8以后：
 * 除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
 *
 * 接口中不能定义构造器
 * java开发中，接口都通过类实现(implements)的方式来使用 若果实现类覆盖了接口的所有抽象方法，则此实现类就可以实例化 如果实现类没有覆盖接口中所有的抽象方法，则类还是抽象类
 *
 * Java可实现多个接口 ---> 弥补Java单继承的局限性 接口与接口关系之间：（多）继承（接口没有构造方法，不能new对象，不是单继承关系）
 *继承的具体使用，使用多态性：
 * 接口实际可以看做一种规范；
 * 抽象类和接口有什么异同？
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
       /* Flyable.MIN_SPEED = 1; *证明我们这个常量还是final
        Flyable.MED_SPEED = 1;
        Flyable.MAX_SPEED = 1;*/

        Plane plane = new Plane();
        plane.fly();
        plane.stop();

        Computer test = new Computer();
        Flash flash = new Flash();
        test.transferData(flash);
    }
}

interface Flyable{

    public static final int MAX_SPEED = 7900;
    /*public static final */int MIN_SPEED = 1;
   public static int MED_SPEED = 20;

    public abstract void fly();

    /*public abstract*/ void stop();

/*    public  Flyable(){
        意味着接口不能实例化
    }*/
}

interface Attackable{

    void attack();
}

class Bullet extends Object implements Attackable,Flyable,CC{//先继承父类 在实现两接口

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }
//子类重写父类   对于重写接口（类）的抽象方法咱们一般叫实现
    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{//抽象类可以不用完写接口的抽象方法
    @Override
    public void fly() {

    }
}
//****************************************

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{

}
//*****************************************
/*实例演示接口是一种规范*/
class USBTest{
}

interface USB{
    void start();
    void stop();
}

class Computer{
    public void transferData(USB usb){//USB usb = Flash flash 接口的多态性
        usb.start();
        System.out.println("具体传输数据的细节");

        usb.stop();
    }
}
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘启动工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}