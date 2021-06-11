package cn.ItTest.Basic.HashMap;

/**
 * @Auther: Datalong
 * @Date: 2021/5/30 - 05 -30 -10:52
 * @Dscription: cn.ItTest.Basic.HashMap
 * @version: 1.0
 */
public class App extends Object{

    public static void main(String[] args) {
        //Map<String,String> map = new HashMap<>();

        App Map = new App();

        Map.put("码","码");
        Map.put("工","工");
        Map.put("是","是");
        Map.put("小","小");
        Map.put("希","希");
    }


    /**
     * hash算法
     * @param key
     * @param value
     */
    private void put(String key, String value) {
        key.hashCode();
        // Hash默认数组长度16
        System.out.printf("key:%s, hash值：%s, 存储位置：%s\r\n", key, key.hashCode(), Math.abs(key.hashCode() % 5));
    }

}
