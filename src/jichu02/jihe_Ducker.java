package jichu02;
//集合：存储引用数据类型的数据，它是若干个类组合的数据结构的实现
//好处：1降低编程的难度 2提高程序的运行速度和质量 3无需学习新的API 4增加重用性

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Auther: Datalong
 * @Date: 2021/2/16 - 02 -16 -16:09
 * @Dscription: collection接口：是单列集合的顶级接口，在这种集合中存储的的数据，只占一列，所有的元素，直接存储在各种数据结构中，它没有下标的概念；因为接口是单列集合的顶级
 * 接口，在这里定义的所有的方法，在所有的实现类中都是可以使用的
 */
public class jihe_Ducker {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>(); //具体的对象需要具体子类来创建 如ArrayList
        Collection<String> temp=new ArrayList<>();
        
        collection.add("Tom");
        collection.add("Lucy");
        collection.add("Lily");

        temp.add("zhangsan");
        temp.add("lisi");
        temp.add("wanwu");

        collection.addAll(temp);//把temp集合传递过来

/*
        collection.remove("Tom");
        collection.removeAll(temp);
*/
        collection.removeIf(ele -> ele.matches("L.*")); //指定一个参数ele matches 匹配方法
        collection.retainAll(temp); //在collection集合中出现了temp集合的元素会被留下来，没留下来会删掉
        // collection.clear(); 清空集合

       // boolean flag = collection.contains("lisi");//集合是否被包含 flag标记
       boolean flag = collection.containsAll(temp); //当前集合是否包含参数集合中所有元素

        System.out.println();
        System.out.println(collection);
        System.out.println(flag);

        int size = collection.size();

        boolean empty = collection.isEmpty();

        Object[] objects = collection.toArray();//返回object数组 不要参数 等号前面系统提供Oject数组
        //遍历
        for(Object obj:objects){//创建obj 继承于objects
            System.out.println(obj);

            String[] strings = collection.toArray(new String[6]);//需要我们传入一个数组;因为集合中放的是字符串类型的，那么传递的数组必须是字符串类型
//指定长度比6大，它还会使用者数组，但会有多余空间；比6小内部会创建新的数组，并返回这个新的数组
            for(String str:strings)//创建str
                System.out.println(str);
        }

        System.out.println(objects);
        System.out.println(size);
        System.out.println(empty);
    }
}
