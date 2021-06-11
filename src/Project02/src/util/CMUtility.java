package Project02.src.util;

import java.util.Scanner;

/**
 * @Auther: Datalong
 * @Date: 2021/3/25 - 03 -25 -14:25
 * @Dscription: 将不同的功能封装为方法，就是直接通过调用方法使用它的功能，而无需考虑具体的功能实现细节
 * @version: 1.0 */

public class CMUtility {
 private static Scanner scanner = new Scanner(System.in);
    /*
    * 用于界面的选择，该方法读取键盘，如果用户键入‘1’-‘5’中的任意字符，则方法返回，放回为用户
 */
    public static char readMenuSelection(){
        char c;
        for(; ; ){
            String str = readKeyBoard(1,false);
                c = str.charAt(0);
                if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                    System.out.print("选择错误，请重新输入：");
                }else break;
               return c;
            }
        return c;
    }


        /*
            * 从键盘读取一个字符，并将其作为方法的返回值
            * */
            public static char readChar() {
                String str1 = readKeyBoard(1,false);
                return str1.charAt(0);
            }
            /*
            * 从键盘读取一个字符，并将其作为方法的返回值
            * 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值*/
            public static char readChar(char defaultValue){
                String str2 = readKeyBoard(1,true);
                return (str2.length() == 0) ? defaultValue : str2.charAt(0);
            }
            /*
            *从键盘读取一个长度不超过2位的整数 并将其作为方法的返回值*/
            public static int readInt(int defaultValue){
            int n;
            for (; ; ) {
                String str3 = readKeyBoard(2, false);
                try {
                    n = Integer.parseInt(str3);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("数字输入有误，请重新输入：");
                }
            }
            return n;
        }
        /*从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
            * 如果用户不输入字符串直接回车，方法将以defaultValue作为返回值*/
            public static String readString(int limit, String defaultValue) {
                String str = readKeyBoard(limit, false);
                final String s = str.equals("") ? defaultValue : str;
                return s;
            }

            public static String readString(int limit){
               return readKeyBoard(limit, false);
        }

    public static char readConfirmSelection() {
            char c;
            for(; ;){
                String str = readKeyBoard(1,false).toUpperCase();
                c = str.charAt(0);
                if ((c == 'Y' || c == 'N')){
                    break;
                }else{
                    System.out.println("选择错误， 请重新输入：");
                }
            }
            return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
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


