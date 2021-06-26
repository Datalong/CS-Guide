package jichu02.Thread_Commonit;

/**
 * @Auther: Datalong
 * @Date: 2021/6/12 - 06 -12 -14:23
 * @Dscription: jichu02.Thread_Commonit
 * @version: 1.0
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Thread productorThread = new Thread(new Productor(clerk));
        Thread consumerThread = new Thread(new Consumer(clerk));
        productorThread.start();
        consumerThread.start();
    }
}
