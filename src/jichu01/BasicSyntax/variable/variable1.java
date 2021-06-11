package jichu01.BasicSyntax.variable;
//变量的定义

public class variable1 {
    public static void main(String[] args){
        int n;
        int x,y,z;

        n=10;
        //注意事项：整形字面量，不要超出指定数据类型的范围
        //byte short int long
        byte n1 = 127;
        short n2 = 1000;
        int n3 = 1000;
        long n4 = 1000;
        int n5 = 999;
        //如果一个整形字面量，超出了int的表示范围，此时可以在long后面加L来正确赋值
        //int n5 = 999999999999999;
        long n6 = 999999999999999L;

        //浮点型
        float n7 = 3.14F; //浮点型字面量默认的类型是double类型，如果需要给一个float类型的变量进行赋值，要在后面加F
        double n8 = 3.14;
        double n9 = 31415E-3; //这是科学记数发，这表示31415x10^-3
        double n10 = 628E-3;
        System.out.println("n10:"+n10);

        //布尔型
       // boolean n10 = ture;
        boolean n11 = false;

        //单引号，里只有一个字符
        char n12 = 'a';

        //字符串类型
      //  String.str = "Hello World";//也可不写

        char c = ';';
        //char d ='''; 需引入转义字符 可以将特殊字符，变成普通字符，没有特殊意义
        char e = '\t'; //转义字符   \t制表符
        System.out.println(e);

        System.out.println(n1);
        n=20;
        System.out.println("Hello \n World");

        //自动类型转换
        byte a = 100;
        int b = a;  //由byte向int转型

        int q1 = 200;
        byte q2 = (byte)q1;
        System.out.println(n4);

        System.out.println("姓名：习大大");
        System.out.println("地点：北京 中南海\n姓名：习大大");
        System.out.println();
        System.out.println("姓别：男");
        }
    }

