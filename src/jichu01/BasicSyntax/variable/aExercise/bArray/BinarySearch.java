package jichu01.BasicSyntax.variable.aExercise.bArray;
//二分查询

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(array, 8));
    }

    //element 元素   return 下标
    public static int binarySearch(int[] array, int element) {
        //定义两个变量，记录范围的上限和下限
        int min = 0, max = array.length - 1;

        while(max >= min){
            //找到中间元素的下标
            int mid = (max + min) / 2;

            //判断中间元素和要查询的元素的大小关系
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] > element) {//说明去左侧查询
                max = mid - 1;//修改上限
            }
            else{//修改范围的下限
                min = mid + 1;
            }
        }

        //如果循环走完后，依然没有结果返回，说明要查询的这个数据在数组中不存在
        return -1;
    }
}
class BinarySearch1 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        BinarySearch1 binary1 = new BinarySearch1();

        arr.add(0,6);
        arr.add(1,8);
        arr.add(2,12);
        arr.add(3,3);
        arr.add(4,66);

        System.out.println();
    }
}