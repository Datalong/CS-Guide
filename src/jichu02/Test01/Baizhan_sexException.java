package jichu02.Test01;

/**
 * @Auther: Datalong
 * @Date: 2021/4/18 - 04 -18 -13:27
 * @Dscription: 定义一个自己的异常类 子类重写是，不可抛出原有方法抛出异常的父类或上层类 ArithmeticException算术异常
 * @version: 1.0
 */
public class Baizhan_sexException extends Exception{
    public static void main(String[] args) {
        Baizhan_sexException sexEcpt = new Baizhan_sexException();
    }
public Baizhan_sexException() {
    super();
}
    public Baizhan_sexException(String message) {
            super(message);
    }
    public Baizhan_sexException(Throwable cause, String message) {
    super(cause);
    /*super(message);*/
    }
}

