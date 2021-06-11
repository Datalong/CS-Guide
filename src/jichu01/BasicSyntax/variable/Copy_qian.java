package jichu01.BasicSyntax.variable;

/**
 * @Auther: Datalong
 * @Date: 2021/4/12 - 04 -12 -14:33
 * @Dscription: 浅拷贝:拷贝对象和原始对象的引用类型指向同一对象
 * @version: 1.0
 */
public class Copy_qian implements Cloneable{

    private int[] arr;

    public Copy_qian(){
        arr = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }
    }

    public void set(int index, int value){
        arr[index] = value;
    }

    public int get(int index){
        return arr[index];
    }

    @Override
    protected Copy_qian clone() throws CloneNotSupportedException{
        return (Copy_qian) super.clone();
    }

    public static void main(String[] args) {
        Copy_qian e1 = new Copy_qian();
        Copy_qian e2 = null;
        try{
            e2 = e1.clone();//可能会发生异常 下面进行捕获
        }catch (CloneNotSupportedException w){
            w.printStackTrace();
        }
        e1.set(2,222);
        System.out.println(e2.get(2)); //222
    }
}


