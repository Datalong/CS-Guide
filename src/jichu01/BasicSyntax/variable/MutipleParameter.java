package jichu01.BasicSyntax.variable;
//可变长度的参数列表
public class MutipleParameter {

    public static void main(String[] args){
        //getMax(10,2);
      // int max = getMax1(new int[]{1,2,3,4,5,6,7,8,9,0});//定义没有限制元素的整型数组
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        MutipleParameter test = new MutipleParameter();

        int max = getMax1(1,2,3,4,5,6,7,8,9,0);//可变长度的参数列表，接受多个类型相同的实参，个数不限，使用方式和数组相同 语法：数据类型...类型名（必须放在形参列表的最后位，且这只能有一个）
        int max2 = getMax1(1,2,3);
        int max1 = getMax1(4,5,6,7,8);

        System.out.println(test.toString(max1));
        // System.out.println(max);
    }

    private int toString(int max1) {
        return max1;
    }

    public static int getMax(int a, int b)
    {
        return a > b ? a : b;
    }

    float s = new Float(4.00);

    public static int getMax1(int... array){//可变长度的参数列表的语法
        int max = array[0];
        for(int ele : array){
            if(ele > max){

                max = ele;
            }
        }
        return max;
    }
}
