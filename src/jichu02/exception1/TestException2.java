package jichu02.exception1;

import java.util.Scanner;

/**
 * @Auther: Datalong
 * @Date: 2021/4/28 - 04 -28 -17:10
 * @Dscription: ArithmeticEception 算术异常 当输入人数为0（发生异常后面代码就不执行这就不好） InputMismatchException 输入不匹配异常
 * 出现异常后，会生成相应的异常对象，java系统寻找匹配的catch块，找到后将异常对象给catch块异常参数
 */
public class TestException2 {
    public static void main(String[] args) {
        try {
            //1 输入总分
            Scanner input = new Scanner(System.in);
            System.out.println("请输入总分：");
            int num1=input.nextInt();//!
            //2 输入人数
            System.out.println("请输入人数：");
            int num2=input.nextInt();//!

            //3 计算平均分并输出
            int result = num1/num2;//!
            System.out.println("平均分是："+result);

        }catch (Exception e) {//InputMismatchException 它接不住算术异常
            //情况1 输出自定义信息
//            System.out.println("除数不能是0，必须输入数字");
            //情况2 输出系统信息
            e.printStackTrace();//打印堆栈信息
            System.out.println(e.getMessage());
            System.err.println(e.toString());//就相当于调e toString 打印异常是什么
            e.printStackTrace();//会逐步追踪异常
            e.getMessage();//的到最后一个异常的提示信息
            System.out.println("除数不能是0，必须输入数字");

            //情况3 向上继续抛 会把抛之后的语句就不会执行
            throw e;
        }

        System.out.println("3q3q");
        System.out.println("byte");
    }
}
