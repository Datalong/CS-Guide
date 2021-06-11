package jichu02.exception1;

/**
 * @Auther: Datalong
 * @Date: 2021/5/30 - 05 -30 -8:08
 * @Dscription: jichu02.exception1
 * @version: 1.0

public class ThrowTest {
    public static void main(String[] args) {
        ThrowTest t = new ThrowTest();
        try{
            t.readFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void readFile(){
       File file;
       FileInputStream in = new FileInputStream("atlong.txt");
       int b;
       b = in.read();
       while (b != -1){
           System.out.println((char) b);
           b = in.read();
       }
       in.close();
    }
}
 */