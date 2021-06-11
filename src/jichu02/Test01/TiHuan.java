package jichu02.Test01;

/**
 * @Auther: Datalong
 * @Date: 2021/4/18 - 04 -18 -20:22
 * @Dscription: 将 语句中"Gate"全部替换为“Gates"
 * @version: 1.0
 */
public class TiHuan {
    public static void main(String[] args){
        String s ="I follow Bill Gate.Tom Gate.John Gate";
        System.out.println(s);
        s=s.replaceAll("Gate","Gates");
        System.out.println(s);

        TiHuan.resovrse("china");
    }

    public static void resovrse(String str){
       StringBuilder result = new StringBuilder();
       StringBuilder test = new StringBuilder();

        char[] chArra=str.toCharArray();
        for(int i= chArra.length-1; i>=0; i--) {
            char ch = chArra[i];//StringBuilder1.append(StringBuilder2)是放在一起的
          test.append(ch);
          result.append(result);//其实是创建一个新的数组扩大了长度，将需要添加的字符创赋值到这个新的数组中 “String1"+"String2"是存在不同的两个地址内存，
        }
        System.out.println(test);
        System.out.println(result);
    }
}
