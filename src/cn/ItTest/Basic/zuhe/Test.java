package cn.ItTest.Basic.zuhe;

/**
 * @Auther: Datalong
 * @Date: 2021/4/12 - 04 -12 -21:17
 * @Dscription:
 * @version: 1.0
 */
public class Test {

    private static Object IntegerCache = null;

    public static Object IntegerCache1 = null;

    public static void main(String[] args) {

    Integer x = 2;
    int y = x;
    int i = 0;

    Integer z = Integer.valueOf(123);
    Integer k = Integer.valueOf(123);
        System.out.println(z == k);

        String s1 = new String("aaa");
        String s5 = new String("bbb");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);

        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3 == s4);
        System.out.println(s1 == s5);

    }

    public static void setIntegerCache(Object integerCache) {
        IntegerCache = integerCache;
    }

    public static Integer getIntegerCache() {
        return (Integer) IntegerCache;
    }


}
