package jichu02;

import java.util.HashSet;

/**
 * @Auther: Datalong
 * @Date: 2021/2/27 - 02 -27 -17:06
 * @Dscription: 哈希表（数组+连表） 添加元素是无序
 * @version: 1.0
 */
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();

        hashset.add(16);
        hashset.add(6);
        hashset.add(26);
        hashset.add(18);//如何保证对象唯一 1 比较哈希值2 怡口方法返回true则是同一值
        hashset.add(18);//如何保证对象唯一

        System.out.println(hashset);
        System.out.println(new Integer(16).hashCode());//1 16的哈希是 18的哈希值是18与5取余是3

    }
}
