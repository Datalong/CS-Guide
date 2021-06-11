package jichu02;

import java.util.HashSet;

/**
 * @Auther: Datalong
 * @Date: 2021/2/27 - 02 -27 -19:32
 * @Dscription: HashSet类的使用
 * @version: 1.0
 */
public class HashSet_Make {
    public static void main(String[] args) {//姓名年龄相同的认为是同一个用户，不能重复添加
        HashSet<User> hashSet = new HashSet<>();

        User user1 = new User("lisi",24);
        User user2 = new User("zhansan",26);
        User user3 = new User("wangwu",20);
        User user4 = new User("zhaoliu",22);
        User user5 = new User("xiaoming",29);
        User user6 = new User("wangwu",20);

        hashSet.add(user1);
        hashSet.add(user2);
        hashSet.add(user3);
        hashSet.add(user4);
        hashSet.add(user5);
        hashSet.add(user6);

        System.out.println(hashSet);//User类重写toString方法
        System.out.println(hashSet.size());
    }

}
