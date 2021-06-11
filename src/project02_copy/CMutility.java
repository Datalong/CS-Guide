package project02_copy;

import java.util.Scanner;
/**
 * @Auther: Datalong
 * @Date: 2021/3/30 - 03 -30 -9:31
 * @Dscription: project02_copy
 * @version: 1.0
 */
public class CMutility {
private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection1(){
        char b;
        for(;;){
            String str = readKeyBoard1(2,false);
            b=str.charAt(0);
            if(b != '1' && b != '2' && b != '3' && b != '4' && b != '5'){
                System.out.print("输入错误， 请重新输入：");
            }else break;
            return b;
        }
        return b;
    }

    /*从键盘读取一个字符，并将其作为方法的返回值*/
    public static char readChar1(){
        String str = readKeyBoard1(1,false);
        return str.charAt(0);
    }

    public static char readChar1(char defaultValue1){
        String str = readKeyBoard1(1,true);
        return (str.length() == 0) ? defaultValue1 : str.charAt(0);
    }
    public static String readKeyBoard1(int limit, boolean blankReturn){
        String line = "";

        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if (line.length() == 0){
                if(blankReturn) return line;
                else continue;
            }
        }
        return line;
    }


}
