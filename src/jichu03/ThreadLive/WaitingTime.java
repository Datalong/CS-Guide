package jichu03.ThreadLive;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: Datalong
 * @Date: 2021/5/18 - 05 -18 -15:13
 * @Dscription: jichu03.ThreadLive
 * @version: 1.0
 */
public class WaitingTime implements Runnable{
    @Override
    public void run() {
        while (true) {
            waitSecond(200);
        }
    }

    public static final void waitSecond(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
