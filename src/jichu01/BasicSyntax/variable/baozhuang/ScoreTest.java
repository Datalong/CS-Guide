package jichu01.BasicSyntax.variable.baozhuang;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Auther: Datalong
 * @Date: 2021/4/12 - 04 -12 -17:02
 * @Dscription: 包装类的练习
 * @version: 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1 实例化Scanner 从键盘读取成绩
        Scanner scan = new Scanner(System.in);
        //2 相当于原来的数组
        Vector v = new Vector();
        //3 for(;;)死循环 添加数据用vector的方法addelement() 
        
        int maxScore = 0;
        for(;;) {

            System.out.println("请输入学生成绩(当输入负数表示结束；)\n");
            int score = scan.nextInt();
            if (score < 0) {
                break;
            }if(score > 100) {
                System.out.println("你输入的数据非法，重新输入；");
                continue;//接着下一次循环
            }
            
           Integer inScore = new Integer(score);
           v.addElement(inScore);//JDK5.0之前，int转换为Integer 多态

            //JDK5.0之后用addElement
            /*v.addElement(score);*///自动装箱
            //4 获取最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }
  
        //5 遍历vector得到每个学生的成绩 并最大成绩比较每个学生的等级
        char level = 0;
      for (int i=0; i<v.size(); i++){
          Object obj = v.elementAt(0);//v的索引 Object是对象不能与基本类型进行数值比较
          //JDK5.0之前
          Integer inScore = (Integer)obj;//把obj强转
          int score = inScore.intValue();
          
          if (maxScore  - score <= 10){
              level = 'A';
          }else if(maxScore -score <= 20) {
              level = 'B';
          }else if (maxScore-score <= 30) {
              level = 'c'; 
          }else if (maxScore-score <= 40) {
              level = 'D';
          }

          System.out.println("student-"+i+"score is"+score+",等级："+level);
      }
    }
}
