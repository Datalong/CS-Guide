package jichu02.DeadLock;

/**
 * @Auther: Datalong
 * @Date: 2021/6/11 - 06 -11 -20:25
 * @Dscription: jichu02.DeadLock
 * @version: 1.0
 */
public class Communivation implements Runnable{
    int i = 1;
    public void run() {
        while(true){
            synchronized (this){
                notify();
                if (i <= 100){
                    System.out.println(Thread.currentThread().getName()+":"+ i++);
                }
            }
        }
    }

}
