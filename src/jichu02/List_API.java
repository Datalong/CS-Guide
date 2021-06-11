package jichu02;
//List集合是单列集合，是Collection接口的子接口，Collection接口中的所有的方法，它都有，同时有更多的（操作下标）

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Datalong
 * @Date: 2021/2/19 - 02 -19 -10:28
 * @Dscription: List集合的API
 * @version: 1.0
 */
public class List_API {
    public static void main(String[] args) {
        List<String> list = new ArrayList();//具体子类创建List集合对象

        list.add("zhangsan");
        list.add("lisi");
        list.add("wansi");

//        list.add(1,"zhaoliu");//第二位
          list.addAll(2,list);
//        list.remove(1);
//        list.set(2,"zhaoqi");
//        list.replaceAll(ele->ele.concat("aa"));//concat字符串连接方法 ele是内置参数 --先连接 后替换
//        String s = list.get(2);//根据下标获取元素
        int index = list.indexOf("lisi");//根据元素获取第一次它的下标
        index = list.lastIndexOf("lisi");//拿到第二次出现的下标

      //  System.out.println(s);
        //  System.out.println(index);

        List<String> list2 = list.subList(1, 4); //返回也是List集合 包含起始，不包含结束
        System.out.println(list2);

        System.out.println(list);
    }
}
