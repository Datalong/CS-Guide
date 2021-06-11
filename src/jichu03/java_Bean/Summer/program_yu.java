package jichu03.java_Bean.Summer;

import java.util.Arrays;

/**
 * @Auther: Datalong
 * @Date: 2021/3/13 - 03 -13 -11:27
 * @Dscription: &和&&(短路与）的异同
 * @version: 1.0
 */
public class program_yu<num3, num2, num1> {

    public static void main(String[] args) {

        //1 boolean equals (int[] a,int[] b):判断两个数组是否相等；
        int[] arr1=new int[]{1,2,3,4};
        int[] arr2=new int[]{1,3,2,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        if(arr1 == arr2) {
            System.out.println("arr1与arr2相等");
        }else {
            System.out.println("不相等");
        }

        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {//短路与常用
            z++;
            System.out.println("z="+z);
        }else {
            if ((x == false) || (++z == 43)) {
                z++;
                System.out.println("x="+x);
            }

        }


        //String toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        //void fill(int[] a,int val):将指定值填充到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //void sort(int[] a)
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //二分查找
        int[] arr3=new int[]{-98,34,2,34,54,66,79,105,210,333};
        int index=Arrays.binarySearch(arr3,210);
        System.out.println(index);

        System.out.println("z=" + z);
    }


}