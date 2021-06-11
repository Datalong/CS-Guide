package jichu01.BasicSyntax.variable;
//顺序查询 查数组中指定的元素出现的下标

public class FindElement1 {
    public static void main(String[] args){
        int[] array = {1,3,5,2,8,9,6,4,7};
        int index = indexOf(array, 5);
        System.out.println(index);
    }
    //array 查询的数组； element 需要查询的元素； return 元素出现的下标 如果不存在 返回-1
    public static int indexOf(int[] array,int element){
        for (int i = 0; i < array.length; i++) {//遍历数组中的每个元素
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    //二分查询
    public static int sum(int[] array, int index){
        if(index == 0){
            return array[0];
        }
        return array[index]+sum(array, index-1);
    }
}
