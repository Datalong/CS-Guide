package jichu02.Thread_Commonit;

/**
 * @Auther: Datalong
 * @Date: 2021/6/12 - 06 -12 -12:34
 * @Dscription: jichu02.Thread_Commonit
 * @version: 1.0
 */
public class Consumer implements Runnable{
    Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始取走产品");
        while (true){
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
