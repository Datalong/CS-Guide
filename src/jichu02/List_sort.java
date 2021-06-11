package jichu02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: Datalong
 * @Date: 2021/2/19 - 02 -19 -11:02
 * @Dscription: jichu02
 * @version: 1.0
 */
public class List_sort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//具体子类创建List集合对象

        list.add("lisi");
        list.add("zhaosi");
        list.add("wangsi哈哈");

        // list.sort(new MyCompare());传入子类
        list.sort((e1,e2) -> e2.length()-e1.length());//lambda表达式 简化

        for (String str : list) {
            System.out.println(str);//用list.forEach 子类Compare不用加static
        }
    }


static class MyCompare implements Comparator<String>//用String类型的接口Comparator去定义MyCompare子类 string是要去比较的类型
{
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();//从短到长排序
    }
}

}