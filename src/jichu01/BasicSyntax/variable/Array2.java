package jichu01.BasicSyntax.variable;

public class Array2 {
    //引用数据类型的案例

    public static void main(String[] args) {
        int a = 18;
        int b = 66;

        swap(a, b);
    }

    public static void swap(int x, int y){
        int tmp = x;
        x = y;
        y =tmp;

        System.out.println(x);
        System.out.println(y);

        //抽象类中有可以修饰
    }
}


