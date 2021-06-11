package jichu02;
//LinkedList和ArrayList特有的方法

import java.util.LinkedList;

/**
 * @Auther: Datalong
 * @Date: 2021/2/27 - 02 -27 -16:44
 * @Dscription: 特有功能实现
 * @version: 1.0
 */
public class Array_LinkedList_Method {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>();//创建linkedList

        linkedList1.addFirst("hello");//每次向链表的头添加
        linkedList1.addFirst("my");
        linkedList1.addFirst("friend");

        linkedList1.getFirst();
        linkedList1.getClass();
        linkedList1.getLast();

        System.out.println(linkedList1);

        System.out.println(linkedList1.getFirst());
        System.out.println(linkedList1.getLast());
        System.out.println(linkedList1.getClass());

//        String last = linkedList1.removeLast();
//        System.out.println(last);

//        String pop = linkedList1.pop();//获取链表顶元素
//        System.out.println(pop);

        linkedList1.push("html");//默认添加头部
        System.out.println(linkedList1);
    }
}
