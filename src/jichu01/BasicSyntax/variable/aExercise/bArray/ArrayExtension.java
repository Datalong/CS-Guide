/*import java.util.Arrays;

package jichu01.BasicSyntax.variable.aExercise.bArray;

import java.util.Arrays;


public class ArrayExtension {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array = add(array, 10);


    }

    public static void growup(){
        //        数组扩容：实例化一个新的指定长度的数组，将原数组中的元素依次拷贝到新数组中
        int[] original = {1,2,3,4,5};
        int[] newArray = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        newArray[newArray.length-1] = 6;//将6放到newArray的最后一位
        original = newArray;//重定向original的地址指向

        System.out.println(Arrays.toString(original));//遍历数组，输出数组中的所有元素
    }//扩容基本思路

    *//*add方法扩容 需求：一个元素拼接到现有数组最后 return 添加元素之后的数组*//*
    public static int[] add(int[] array, int element){
        //容量+1 每个元素拷贝到新数组
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = element;//元素添加到最后一位


        return array;//返回结果
    }
}*/
