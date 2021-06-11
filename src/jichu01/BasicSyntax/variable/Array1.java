package jichu01.BasicSyntax.variable;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8}; //看需求用哪个 最好用第一种
        int[] array2 = new int[10];
        int[] array3 = new int[]{1, 2, 3, 4, 5};
        //获取一个元素
        int element = array3[3];
        System.out.println(element);

        array2[3] = 100;
        System.out.println(array2[3]);

        System.out.println(array2);//为什么看不到 需要引用
        System.out.println(Arrays.toString(array2));

        for(int i=0; i<array1.length; i++){//下标遍历法：获取下标 修改元素 否则用下面它效率高
            System.out.println("array1的元素："+array1[i]);
        }

        for (int i = 1; i <= array3.length; i++) {
            System.out.println("array3的元素："+i);
        }

        for (int ele : array1) {//增强for循环来获取数组：依次使用数组中的每一个元素，给迭代变量赋值
            System.out.println("array1的元素："+ele);
        }
        for (int ele1 : array2){
            System.out.println("array2的元素："+ele1);
        }

        char c1 = 'a';//'a'=65 'A'=97
         short s2 = 10;
        char s3 = (char) (c1 + s2); //byte char short->两两都是int 不兼容 short与char的结果都不是这两种类型

        byte b1 = 2;
        int i1 = 129;
        byte b2 = (byte) (b1+i1);//long可以接受
        int i2 = b1+i1;

    }
    }