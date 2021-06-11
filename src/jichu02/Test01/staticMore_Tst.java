package jichu02.Test01;

import java.awt.print.PrinterAbortException;
import java.io.IOException;

/**
 * @Auther: Datalong
 * @Date: 2021/4/18 - 04 -18 -13:11
 * @Dscription: this static package import测试
 * @version: 1.0
 */
public class staticMore_Tst {
/*    public static int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String show() {
        this.name = name;
        return this.name;
    }

    public static void main(String[] args) {
        staticMore_Tst.age=20;
        System.out.println(staticMore_Tst.age);
        staticMore_Tst t = new staticMore_Tst();
        System.out.println(t.show());
    }*/

    public static int age;
    private String name;

    public void setName(String name) {
        this.name=name;
    }

    public String show() {
        this.name=name;
        return this.name;
    }

    public static void main(String[] args) {
        staticMore_Tst.age=20;
        System.out.println(staticMore_Tst.age);
        staticMore_Tst t = new staticMore_Tst();
        System.out.println(t.show());
    }
}
class A {//子类重写是，不可抛出原有方法抛出异常的父类或是国内曾类
    public void method() throws IOException, Exception {
    }
class D extends A {
        public void method() throws Exception, IOException, PrinterAbortException {//为什么能抛出折磨多的异常？

        }
}
}
