package jichu02.Thread_Commonit;

/**
 * @Auther: Datalong
 * @Date: 2021/6/12 - 06 -12 -12:12
 * @Dscription: 线程通信示例
 * @version: 1.0
 */
public class Productor implements Runnable{
    Clerk cleck;

    public Productor(Clerk clerk){
        this.cleck = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true){
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.addProduct();
        }
    }
}
