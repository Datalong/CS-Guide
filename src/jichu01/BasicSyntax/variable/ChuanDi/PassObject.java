package jichu01.BasicSyntax.variable.ChuanDi;

/**
 * @Auther: Datalong
 * @Date: 2021/3/22 - 03 -22 -12:40
 * @Dscription: jichu01.BasicSyntax.variable.ChuanDi
 * @version: 1.0
 */
public class PassObject {

    public static void main(String[] args) {
        PassObject test = new PassObject();
        PassObject test1 = new PassObject();

        Circle c = new Circle();//匿名方式
        Circle d = new Circle();

        test.printAreas(new Circle(),5);

        Circle b = new Circle();
        test1.printAreas(new Circle(),8);

    }
    public void printAreas(Circle c, int time){//time 是截止到哪个数

        System.out.println("Radius\t\tArea");

        int i = 1;
        for (; i <= time; i++) {
            c.radius = i; //给圆设置半径值
            double area = c.findArea();
            System.out.println(c.radius + "\t\t" + area);//方法其实对于编译器来说就是double变量
        }

        System.out.println("new radius is " + c.radius);
        //System.out.println("new radius is " + b.radius);
        c.radius = time + 1;

        c.radius=i;
    }
}
