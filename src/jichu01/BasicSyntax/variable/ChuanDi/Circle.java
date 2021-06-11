package jichu01.BasicSyntax.variable.ChuanDi;

/**
 * @Auther: Datalong
 * @Date: 2021/3/22 - 03 -22 -12:35
 * @Dscription: 定义一个Circle类，包含一个double的radius属性 代表圆的半径  findArea()返回圆的面积
 * @version: 1.0
 */
public class Circle {
    double radius;

    public Circle() {
        radius = 1.0;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

}
