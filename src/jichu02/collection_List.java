package jichu02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther: Datalong
 * @Date: 2021/2/18 - 02 -18 -14:31
 * @Dscription: collection集合的遍历：是有添加顺序 可重复
 * @version: 1.0
 */
public class collection_List {

    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();//空间开辟类型为字符的collection对象
//        Collection<String> collection2=new ArrayList<>();
//        Collection<String> collection1=new ArrayList<>();

        collection.add("Tom");
        collection.add("Lucy");
        collection.add("Lucy");
        collection.add("Lily");

        for(String str:collection){
            System.out.println(str);
        }

          Iterator<String> itr = collection.iterator();//拿到了当前集合的迭代器 iterator是Iterator子类创建出来的对象
//
        while (itr.hasNext()){ //迭代器会下移一个位置 此时是Tom 返回true
        String str = itr.next();//使用迭代器的next方法 来取Tom 集合与迭代器类型一致
            System.out.println(str);
        }
        //JDK1.8    才有这遍历
        collection.forEach(ele -> System.out.println(ele));//每遍历一个需输出一下
    }
}

/* 定义接口

public interface CxuanGodJob{

    void writeWell();
}*/
