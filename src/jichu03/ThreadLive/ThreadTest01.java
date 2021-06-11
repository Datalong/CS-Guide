package jichu03.ThreadLive;

/**
 * @Auther: Datalong
 * @Date: 2021/5/31 - 05 -31 -14:31
 * @Dscription: jichu03.ThreadLive
 * @version: 1.0
 */
public class ThreadTest01 {
    public void metnod1(String str){
        System.out.println(str);
    }

    public void method2(String str) {
        metnod1(str);
    }

    public static void main(String[] args) {
        ThreadTest01 s = new ThreadTest01();
        s.method2("hello!");
    }
}
