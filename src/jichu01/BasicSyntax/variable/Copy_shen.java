package jichu01.BasicSyntax.variable;

/**
 * @Auther: Datalong
 * @Date: 2021/4/12 - 04 -12 -14:53
 * @Dscription: 深拷贝
 * @version: 1.0
 */
public class Copy_shen implements Cloneable{

    private int[] arr;

    public Copy_shen() {
        arr = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }

    @Override
    protected Copy_shen clone() throws CloneNotSupportedException {
        Copy_shen result =(Copy_shen) super.clone();
        result.arr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            result.arr[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Copy_shen e1 = new Copy_shen();
        Copy_shen e2 = null;
        try {
            e2 = e1.clone();
        }catch (CloneNotSupportedException Q) {
            Q.printStackTrace();
        }
        e1.set(2,222);
        System.out.println(e2.get(e2.get(9)));
    }
}
