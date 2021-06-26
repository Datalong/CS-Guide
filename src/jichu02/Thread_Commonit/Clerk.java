package jichu02.Thread_Commonit;

/**
 * @Auther: Datalong
 * @Date: 2021/6/12 - 06 -12 -12:15
 * @Dscription: jichu02.Thread_Commonit
 * @version: 1.0
 */
public class Clerk {//售货员
    private int product = 0;

    public synchronized void addProduct(){
        if(product >= 20){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }else {
            product++;
            System.out.println("生产者生产了第"+product+"个产品");
            notify();
        }
    }

    public synchronized void getProduct(){
        if(this.product <= 0){
            try{
                wait();
            }catch ( InterruptedException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("消费者取走了第"+product+"个产品");
            product--;
            notifyAll();
        }
    }
}
