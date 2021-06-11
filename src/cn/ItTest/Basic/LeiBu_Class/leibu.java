package cn.ItTest.Basic.LeiBu_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Datalong
 * @Date: 2021/3/14 - 03 -14 -14:22
 * @Dscription: 内部类 抽象类和接口不能被实例化，实例化只能被实例化具体的方法
 * @version: 1.0
 */
class OuterClass{
    private String name;
    private int age;

class leibu {//无论外围类是否继承某个（接口）实现，对于内部类没有影响；内部类拥有外部类的访问权；
    public leibu(){
        name = "Datalong";
        age = 20;
    }
}
}
class A{

    private static java.lang.Object Object;

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        for (Object obj:list
             ) {
            System.out.println();
        }

        int[] array1 ={1,3,4,5,6};
        ArrayList array2 = new ArrayList();
        int[] array3 = {15, 46, 26, 89, 10, 95, 73,29};

        System.out.println(B.BinarySearch(array3,3));

        array2.add(0,7);
        array2.add(1,8);
        array2.add(2,9);
        array2.add(3,10);

        int[] ret = Arrays.copyOf(array1,6);
        for (int ret_copy:ret
             ) {
            System.out.println(ret_copy+"这是ret的复制");
            System.out.println(ret+"这是ret");
        }

        String ret1 = Arrays.toString(ret);
        System.out.println(ret1+"这是ret1");

        Object[] list1 = new Object[10];
       // System.out.println(list1);

        }
    }

    class B{

    public static int BinarySearch(int[] array3, int element){
        //定义两个变量，记录范围的上限和下限
        int min=0; int max = array3.length-1;

      //  System.out.println("数组3的长度"+array3.length);

        while(max >= min){
            //1 找到中间元素
            int mid = (max+min) / 2;

            //2 判断中间元素和要查询的元素的大小关系
            if(element == mid){
                return mid;
            }else if(array3[mid] > element){
                max = mid-1;//修改范围的上限
            }else{
                min = mid+1;//修改范围的下限
            }
        }

        //如果循环走完后，依然没有结果返回，说明要查询的这个数据在数组中不存在
        return -1;
    }
    }