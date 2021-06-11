package Project1;

/*
* Utility工具类
* 将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，若无需考虑具体的功能实现细节
* */

import java.util.Scanner;

/**
 * @Auther: Datalong
 * @Date: 2021/3/18 - 03 -18 -16:10
 * @Dscription: Utility工具类的声明
 * @version: 1.0
 */

public class Utility {
   private static Scanner scanner = new Scanner(System.in);
   private static Scanner scanner1 = new Scanner(System.in);
    /*
    * 1 用于界面菜单的选择，该方法读取键盘，如果用户输入‘1’-‘4’中的任意字符，则方法返回，返回值为用户输入字符
    * */
    public static char readMenuSelection(){
        char c;
        for(;;){//初始菜单也不知道循环几次
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4'){
                System.out.println("选择错误，请你重新输入：");
            } break;
        }
        return c;
    }

/*    private static String readkeyBoard(int j) {
        String line = "";

        while(scanner.hasNext()){
            line = scanner.nextLine();
            int limit = 0;
            if(line.length() < 1 || line.length() > limit){
                System.out.println();
            }
        }
    }*/
    private static String readKeyBoard(int i) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            int limit = 4;
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("请输入长度 (不大于" + limit + ") 错误，请你重新输入：");
            }
        }
        return line;
    }

    //2 用于收入和支出金额的输入，该方法从键盘输入一个不超过4位的蒸煮，并将其作为方法的返回值
    public static int readNumber(){
        int n;
        for(;;){
                String str = readKeyBoard(4);
                try{
                    n = Integer.parseInt(str);
                    break;
                }catch (NumberFormatException e){
                    System.out.println("数字输入错误，请你重新输入：");
                }
        }
        return n;
    }
    //3 用于收入和支出说明的输入，该方法从键盘读取一个不超过8位的字符串，并将其作为方法的返回值
    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }

    //4 用于确定选择的输入，该方法从键盘读取“Y”或“N”，并肩其作为方法的返回值
    public static char readConfirmSeletion(){
        char c;
        for(;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.println("选择错误，请重新输入：");
            }
        }
        return c;
    }

/*    public static char readConfirmSelection1(){
        char c;
        for(;;){
             String str=readKeyBoard(1).toUpperCase();
             c = str.charAt(0);
             if(c == 'Y' || c == 'N'){
                 break;
             }else{
                 System.out.println();
             }
        }
    }*/
}
