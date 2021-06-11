package jichu02.DeadLock;
/**
 * @Auther: Datalong
 * @Date: 2021/6/11 - 06 -11 -20:00
 * @Dscription: 线程的同步 concurrent.locks.lock接口是控制多个线程对共享资源进行访问的工具。锁提供对共享资源的独占访问，每次只能有一个线程对Lock对象加锁，线程开始访问共享资源
 * 之前应先获得Lock对象
 *
 * @version: 1.0
 */
public class DeadLockTest {
    public static void main(String[] args) {
        final StringBuffer s1 = new StringBuffer();
        final StringBuffer s2 = new StringBuffer();

        new Thread(){
            public void run(){
                synchronized(s1){
                    s2.append("A");

                    s2.append("B");
                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }.start();
    }
}
