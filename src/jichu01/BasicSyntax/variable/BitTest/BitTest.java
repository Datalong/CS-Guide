package jichu01.BasicSyntax.variable.BitTest;

/**
 * @Auther: Datalong
 * @Date: 2021/3/22 - 03 -22 -10:47
 * @Dscription: 运算符-位运算符（了解）
 * @version: 1.0
 */
public class BitTest {

    public static void main(String[] args) {
        int i = 21;
        //21x2^2
        System.out.println("i << 2：" + (i << 2));//如果没括号左移操作数类型错误 因为<<和+在同一级 从头往右走，字符串不可以左移
        System.out.println("i << 3：" + (i << 3));
        System.out.println("i << 4:" + (i << 4));

        int m = 12;
        int n = 5;
        System.out.println("m & n: " + (m & n));//表示各数的二进制 若果有1表示并还是0 反之一样，十进制表示出来
        System.out.println("m | n: " + (m | n));//表示各数的二进制 若果有1表示或还是1 反之一样，十进制表示出来
        System.out.println("m ^ n: " + (m ^ n));//只要两者不一样，就是true=1,反之，然后表示出来

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;

   /*     num1 = num1 + num2;//num1跳到2的脖子上 弊端：+有可能超出范围 只能是数值型对于字符不能减
        num2 = num1 - num2;
        num1 = num1 - num2;*/

        System.out.println("num1="+num1+",num2="+num2);
    }
}
