package jichu01.BasicSyntax.variable.fengzhuan_Test;

/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -7:59
 * @Dscription: jichu01.BasicSyntax.variable.fengzhuan_Test
 * @version: 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

            Person p1 = new Person();
            p1.setAge(17);

        System.out.println("数据是："+p1.getAge());//方法对于编译器来说就是返回值
    }
}
