package jichu01.BasicSyntax.variable;

/**
 * @Auther: Datalong
 * @Date: 2021/3/1 - 03 -01 -6:14
 * @Dscription: jichu01.BasicSyntax.variable
 * @version: 构造方法 new创建对象，就是在调用构造 一旦编写一个构造方法，那么编译器就不在赠送
 */
public class gouzao {//用来创建对象的

    public static void main(String[] args) {

        Demogouzao ele1 = new Demogouzao();
        Demogouzao ele2 = new Demogouzao("小明",20);

        Demogouzao ele3 = new Demogouzao("小明",20);
        System.out.println("姓名："+ele3.getName()+"年龄"+ele3.getAge());//set方法也有用 改变对象内容用
    }

}
