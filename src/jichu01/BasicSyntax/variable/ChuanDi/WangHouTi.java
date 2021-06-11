package jichu01.BasicSyntax.variable.ChuanDi;

import java.io.PrintStream;

/**
 * @Auther: Datalong
 * @Date: 2021/3/22 - 03 -22 -11:31
 * @Dscription: jichu01.BasicSyntax.variable.ChuanDi
 * @version: 1.0
 */
public class WangHouTi {

    public static void main(String[] args) {

        int[] arr = new int[]{12,3,3,34,56,77,432};//让数组每个位置上的值去除首位元素，得到的结果，作为该位置上的新值，在遍历下
        int[] arr1 = new int[]{1,2,3};
        System.out.println(arr1);//调用println(Object n) 打印的是地址

        int[] arr3 = new int[]{1,2,3,4};
        char[] arr2 = new char[]{'a','b','c'};//输出多少
        System.out.println(arr2);//调用println(char[] n) 这个方法就是遍历

        int a = 10;
        int b = 20;

       /* method(10,20);
        method1(10,20);*/
        //写法1
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=arr[i]/arr[0];
        }
        //写法2
        int tmp = arr[0];
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]/tmp;
        }

        System.out.println(a);
        System.out.println(b);
    }
    public static void method(int a, int b){
        a=a*10;
        b=b*10;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);//调完之后不让输出main方法
    }

    public static void method1(int a, int b){

        PrintStream ps = new PrintStream(System.out){
          @Override
          public void println(String x){

              if ("a=10".equals(x)){
                  x="a=100";
              }else if("b=10".equals(x)){
                  x="b=200";
              }
              super.println(x);
          }
        };

        System.out.println(ps);
    }
}
