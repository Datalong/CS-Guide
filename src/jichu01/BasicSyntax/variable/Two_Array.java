package jichu01.BasicSyntax.variable;

import java.util.ArrayList;

public class Two_Array {
    public static void main(String[] args) {
        //实例化方式
        //String[][] array;
        //int[][] array1 = new int[5][];i
        //System.out.println(array1);
        String[][] array;
        int[][] arr = new int[5][3];

        //1 给定一个二维数组长度，一维数组长度，进行实例化
        int[][] array2 = new int[5][3];//5个元素的整形二维数组中存放的是3个元素的一维数组，不是默认NULL值 3仅仅是初始长度
        //System.out.println(array2);

        ArrayList array3 = new ArrayList<String>();

        array3.add(0,1);

        //2 指定的值 实例化二维
        //int[][] array3 = new int[][]{{1,2},{3,4,5},{6,7,8,9}};
        int[][] arr1 = new int[][]{{1,3},{1,4},{3,4}};

        //3 指定的值 实例化二维
        int[][] array4 = {{},{},{},};

        //一维数组元素的访问
        int[][] arr2 = new int[1][1]; //获取二维数组中的一位数组
        array2[1] = new int[]{2, 3, 4, 5, 6, 7, 8};

        int ele = array2[1][3];//访问一维数组的元素

        System.out.println(ele);

        array2[2][2]=3;
        System.out.println(array2);
    }
    public static void init (){

    }
}