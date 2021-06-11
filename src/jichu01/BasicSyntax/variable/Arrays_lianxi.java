package jichu01.BasicSyntax.variable;

import java.util.Scanner;

/**
 * @Auther: Datalong
 * @Date: 2021/3/13 - 03 -13 -15:05
 * @Dscription: jichu01.BasicSyntax.variable
 * @version: 1.0
 */
public class Arrays_lianxi {

    public static void main(String[] args) {
        int[] arr=new int[]{8,2,1,0,3};

        String[] arr1=new String[]{"老师","学生","课本"};
        int[] index=new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel="";
        for (int i = 0; i < arr.length; i++) {
            tel += arr[index[i]];/*tel=tel+arr[index[i]]*/
        }
        String tel1="";
        for (int i=0; i < arr1.length; i++){

            tel1 += arr1[index[i]];
        }

        System.out.println("");
        System.out.println("联系方式："+tel);
        System.out.println("老师信息："+tel1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number = scanner.nextInt();

        int[] scores = new int[number];//学生成绩动态初始化

        System.out.println("请输入"+number+"学生成绩：");//给数组中的元素赋值
        int maxScore=0;

        for(int i=0;i < scores.length;i++){
            scores[i]=scanner.nextInt();//读一个值 赋一个值

            if(maxScore < scores[i]){
                maxScore=scores[i];
            }
        }

//        int maxScore = 0;
//        for(int i=0;i < scores.length;i++){
//            if(maxScore < scores[i]){
//                maxScore=scores[i];
//            }
//        }

        char level;
        for(int i=0;i<scores.length;i++){
            if(maxScore - scores[i] <= 10){
                level = 'A';
            }else if(maxScore - scores[i] <= 20){
                level = 'B';
            }else if(maxScore - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }

            System.out.println("student "+ i + "score is" + scores[i] + ",grade is" + level);
        }
    }
}
