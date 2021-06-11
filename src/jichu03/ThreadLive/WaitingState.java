package jichu03.ThreadLive;

/**
 * @Auther: Datalong
 * @Date: 2021/5/18 - 05 -18 -15:17
 * @Dscription: jichu03.ThreadLive
 * @version: 1.0
 */
public class WaitingState implements Runnable{
    @Override
    public void run() {
        while (true) {
            synchronized (WaitingTime.class) {
                try {
                    WaitingTime.class.wait();
                }catch (InterruptedException f)  {
                  f.printStackTrace();
                }
            }
        }
    }
}
