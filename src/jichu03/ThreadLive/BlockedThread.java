package jichu03.ThreadLive;

/**
 * @Auther: Datalong
 * @Date: 2021/5/18 - 05 -18 -15:23
 * @Dscription: jichu03.ThreadLive
 * @version: 1.0
 */

public class BlockedThread implements Runnable{
    @Override
    public void run() {
        synchronized (BlockedThread.class) {
            while (true){
                WaitingTime.waitSecond(100);
            }
        }
    }
}
