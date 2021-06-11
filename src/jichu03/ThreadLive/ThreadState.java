package jichu03.ThreadLive;

/**
 * @Auther: Datalong
 * @Date: 2021/5/18 - 05 -18 -15:27
 * @Dscription: jichu03.ThreadLive
 * @version: 1.0
 */
public class ThreadState {

    public static void main(String[] args) {
        new Thread(new WaitingTime(), "waitingTimeThread").start();
        new Thread(new WaitingState(), "waitingStateThread").start();


        //BlockedThread-01线程抢到锁了，BlockedThread-02线程会阻塞
        new Thread(new BlockedThread(), "BlockedThread-01").start();
        new Thread(new BlockedThread(), "BlockedThread-02").start();
    }
}
