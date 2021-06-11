package jichu02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Datalong
 * @Date: 2021/2/19 - 02 -19 -18:07
 * @Dscription: List集合的遍历
 * @version: 1.0
 */
public class List_bianlide {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//用方法来实例化Int泛型的集合
        List<String> list1 = new ArrayList<>();//用方法来实例化String类型的集合

        Collections.addAll(list,10,20,30,40,50,60);//工具类下调用方法

       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        Iterator<Integer> ite = list.iterator();//Iterator迭代器泛型是Integer
        while (ite.hasNext()){
            Integer num = ite.next();//获取元素

            if(num == 30){
                ite.remove();
                System.out.println(list1);
                System.out.println(num);
            }
                System.out.println(list);
        }
    }
}
