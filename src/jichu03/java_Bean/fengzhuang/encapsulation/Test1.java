package jichu03.java_Bean.fengzhuang.encapsulation;

import java.util.ArrayList;

/**
 * @Auther: Datalong
 * @Date: 2021/3/1 - 03 -01 -18:58
 * @Dscription:
 * @version: 1.0
 */
public class Test1 {


    public static void main(String[] args) {

        ArrayList ar = new ArrayList<String>();
        ar.add(0,'a');
        ar.add(1,'b');
        ar.add(2,'d');
        ar.add(3,'d');
        ar.add(4,'e');

      boolean str = ar.contains('b');
        System.out.println(str);
        int str1 = ar.indexOf('e');
        System.out.println(str1);
      int[] arr = new int[]{1,2,3};
        int[][] arr1=new int[][]{{1,2,3},{4,5},{6,7,8}};

        String[][] arr2=new String[3][2];
        String[][] arr3=new String[3][];

        //错误情况
        //String[][] arr4=new String[][4];
        //String[4][3] arr5=new String[][];
        //int[][] arr6=new int[4][3]{{1,2,3},{4,5},{6,7,8}};
        //ids=new int[]{1001,1002,1003,1004};

        //String[][] array=new String[][1];
        //String[4][3] array1=new String[][];
        //int[][] array2=new int[4][3]{{1,2,3},{4,5},{6,7,8}};
        //正确情况
        int[] arr4[]=new int[][]{{1,2,3},{4,5},{6,7,8}};
        int[] arr5={1,2,3,4,5};//类型推断 因为ing也不能new其他的数组
        int[][] arr10={{2,3},{4,5}};

        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]);
       // System.out.println(arr3[1][0]);//空指针异常

        //arr3[1]=new String[4]; 给空的二维数组创建四元素的一维数组
        //System.out.println(arr3[1][0]);

       /* arr3[3]=new String[3];*/
        for (int i = 0; i < arr4.length; i++) {

            for(int j=0;j<arr4[i].length;j++){
                System.out.println(arr4[i][j]+ " ");
            }
            System.out.println();
        }
        //数组元素的初始化值
        //二维数组分为外层数组的元素，内层循环的元素 外层元素：arr[0]，arr[1]  内层元素：arr[0][0],arr[1][2]等
        int[][] arr6=new int[4][3];
        System.out.println(arr6[0]);//外层 就是存的地址值 栈那么瘦 不会放一维数组
        System.out.println(arr6[0][0]);//内层

        //System.out.println(arr);//说明是二维数组
        System.out.println("*****************************");
        float[][] arr7= new float[4][3];
        System.out.println(arr7[0]);//外层 就是存的地址值 栈那么瘦 不会放一维数组
        System.out.println(arr7[0][0]);//内层 0.0

        System.out.println("*****************************");
        String[][] arr8= new String[4][2];
        System.out.println(arr8[1]);
        System.out.println(arr8[1][1]);

        System.out.println("*****************************");
        double[][] arr9=new double[4][];
        System.out.println(arr9[1]);//外层 是啥
        //System.out.println(arr9[1][0]); 看32行 因为arr9[1]都没有指针了，咋个指

        System.out.println();



        Student stu = new Student();
        Student stu1 = new Student();
        stu.name="小明";
        cn.ItTest.Basic.FenZhuang.stu.gender="男";
        cn.ItTest.Basic.FenZhuang.stu.score=96.3;

        stu1.gender="男";
        stu1.score=99;
        stu1.name="小华";

        stu1.introduce();

        System.out.println("一年以后");
        //对属性进行修改
        stu.name="小李";
        stu.gender="girl";
        stu.score=100;
        stu.introduce();
    }
}

class Test2 extends Test1{
    //对象的向上转型,其实就是多态的写法
    Test1 worker = new Test2();
    //Test2 worker1 = new Test1(); 向下转型若果对象创建的不是猫，转成猫就会出现ClassCat异常

        }