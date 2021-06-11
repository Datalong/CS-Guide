package util;

import java.util.Random;

/**
 * @Auther: Datalong
 * @Date: 2021/5/1 - 05 -01 -20:54
 * @Dscription: 工具类
 * @version: 1.0
 */
public class MyUtil {
    private MyUtil() {

    }

    public static int getRandom(int max) {
        return new Random().nextInt(max+1); //[0,max)
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(getRandom(2));
        }
    }
}
