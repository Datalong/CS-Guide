package jichu01.BasicSyntax.variable;

import java.util.Arrays;

//Array工具类(里面包含了若干个对数组操作的方法)
public class ArrayTools {
    public static void main(String[] args){

        int[] array = {1,4,5,6,3,6,7,8,2};
        int[] array1 = new int[]{1,3,5,7,9,2,8,6,4,0};
        //object[] 是可以传引用类型数组；包括一些ArrayList
        int[] ret1 = Arrays.copyOf(array,15);//拷贝多的就填0
        for (int copy_ret1 : ret1) {
            System.out.println(copy_ret1);
        }
        for (int copy_array: array) {
            System.out.println("新的"+copy_array);
        }

       String ret2 = Arrays.toString(ret1);//将数组中的元素拼接成字符串返回
        System.out.println(ret2);

         int[] ret3 = Arrays.copyOfRange(array, 2,17);//在原数组中拷贝指定的元素到新数组并返回 to可以越界 多的补零 from不可以
         System.out.println(Arrays.toString(ret3));

         boolean equals = Arrays.equals(array,array1);//比较两个数组的大小
         System.out.println(equals);
         Arrays.fill(array1, 8);
        System.out.println(Arrays.toString(array1));//使用指定的数据填充数组

          Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//对数组中的元素进行排序（升序）

        int index = Arrays.binarySearch(array1,5);//使用二分查询法，查询数组中指定下标来
        System.out.println(index);

    }
}
