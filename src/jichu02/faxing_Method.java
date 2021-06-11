package jichu02;

/**
 * @Auther: Datalong
 * @Date: 2021/2/16 - 02 -16 -15:45
 * @Dscription: 泛型方法
 * @version: 1.0
 */
class Test<T> {
    public void show(T t) {
        System.out.println(t);
    }

    public <E> void fun(E t) {//方法自己使用泛型，意思是方法的参数类型任意
        System.out.println(t);
    }

    public static <E> void ff(E t) {//静态方法可以通过类名调用(是不用创建test对象的，那这个泛型就不能指定了），所以静态方法只能自己使用泛型
        System.out.println(t);
    }

    private static <E> void String(E t) {
        System.out.println(t);
    }

public static class faxing_Method {
    public static void main(String[] args) {
        Test<String> test = new Test();
        test.show("Hello");

        test.fun(66);

        test.ff(5.6);//跟string是没有关系的

        test.String("123");
    }
}
}
