package cn.ItTest.Basic.Interface;

/**
 * @Auther: Datalong
 * @Date: 2021/4/16 - 04 -16 -19:34
 * @Dscription: JDK7之前：
 * 只能去定义常量和抽象方法 全局常量：public static final JDK8之后：之外，可定义静态方法，默认方法  接口不能写构造器
 * @version: 1.0
 */
public class InterfaceTest implements Flyable{
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        /*Flyable.MIN_SPEED = 2;*/
    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

interface Flyable {

    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//默认 public final

    public abstract void fly();
    /*public abstract*/ void stop();
}

class Plane implements Flyable {//如果类重写接口中的所有抽象方法，就实现类就可以实例化

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

