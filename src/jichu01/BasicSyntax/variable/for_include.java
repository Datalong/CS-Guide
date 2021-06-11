package jichu01.BasicSyntax.variable;

public class for_include {
    public static void main(String[] args) {
        //嵌套循环
        for (int line = 1; line <= 9; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print(column + "x" + line + "=" + column * line + "   ");
            }
            System.out.println();
        }

        //案例：母鸡5元 公鸡3元 三只小鸡1元
        for (int m = 0; m <= 100 / 5; m++) {
            for (int g = 0; g <= 100 / 3; g++) {
                for (int x = 0; x <= 100; x += 3) {//只买100只
                    if (m * 5 + g * 3 + x / 3 == 100 && m + g + x == 100) {//判断条件
                        System.out.println("母鸡：" + m + "只,公鸡：" + g + "只,小鸡：" + x + "只");
                    }
                }
            }
        }

        int b = 1;
        while(b <= 100){
            System.out.println(b++);
        }

        int num=1;
        do{
            System.out.println(num++);
        }while(num <= 100);//如果一开始的提哦啊见不成立，do-while会多执行一次循环体

        int number = 200;
        String result = "";//如果循环的次数是不可预期的，但有明确的结束条件，推荐使用while,否则可预期使用for
        while(number != 0){
            result = number % 2 +result;
            number /= 2;
        }
        System.out.println("Ob"+result);

        //案例：小明在操场跑步100米，跑50米，脚崴了，不能跑
        for(int d=0;d<=100;d++){
            if(d == 50){
                System.out.println("小明脚崴了");
                break;//不管条件是否成立，跳出循环
            }
            System.out.println("小明在跑步 已经跑了"+d+"米");
        }

        for(int d=0;d<=100;d++){
            if(d == 50){
                System.out.println("小明发现有坑！跳过去");
                continue;//退出本次进入下一次
            }
            System.out.println("小明在跑步 已经跑了"+d+"米");
        }


        for(int e=0;e<=5;e++){
            OUTER://对循环打标签 配合break和continue作用在外层循环
            for(int f=0;f<=5;f++){
                if(f == 3){
                    continue OUTER;//只能作用于内层循环
                }
                System.out.println("e="+e+",f="+f);
            }
        }

    }
}
