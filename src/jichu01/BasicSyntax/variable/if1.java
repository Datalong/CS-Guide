package jichu01.BasicSyntax.variable;

public class if1 {
    public static void main(String[] args){
        //需求：讲一个成绩划分到对应的区间

        int score = 76;
        int count = 88;

        if(count < 0 || count > 100){
            System.out.println("成绩错误");
        }else if(count < 60)
        {
            System.out.println("不及格");
        }else if(count < 80){
            System.out.println("良");
        }else if(count < 100){
            System.out.println("优");
        }

        if(score < 0 || score > 100)
        {
            System.out.println("成绩错误");
        }else if(0 <= score && score < 60){
            System.out.println("成绩不及格");
        }else if(60 <= score && score < 88){
            System.out.println("成绩及格");
        }else if(88 <= score && score < 100){
            System.out.println("成绩优秀");
        }

        int season = 3;

        switch(season){
            default://可以写在Switch中任意位置
                System.out.println("不是");//没有遇到break 往下穿透

            case 1:
               System.out.println("春天");//有穿透性 否则用break
                break;
            case 2:
                System.out.println("夏天");
                break;
        }
//循环的三要素：起点 条件 步长

        for (int i=0;i<=100;i++){
        System.out.println(i);
        }

        for(int number = 1;number <= 100;){
            if(number % 2 != 0){
                System.out.println(number++);
            }

            int a = 1;
        for(;;){//每部分可不写 或单独写在外面
            System.out.println(a++);//写的少
            if(a > 100){
                break;
            }

            //嵌套循环
            for(int b = 1;b < 9;b++){
                for(int c = 1;c < 9;c++){
                    System.out.println(b*c);
                }
            }

            System.out.println(a);
        }





        }
    }
}
