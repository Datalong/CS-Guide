package jichu03.Super;

import jichu01.BasicSyntax.variable.ChuanDi.Circle;

/**
 * @Auther: Datalong
 * @Date: 2021/4/9 - 04 -09 -19:05
 * @Dscription:假如有n个构造器，至少有1个用super()（其他都是this）去调父类的构造器
 * @version: 1.0
 */
public class Cylinder extends Circle {

    private double length;//高

    public Cylinder(){
        super();//调用父类的Circle()导致半径为1 面积是π
        length = 1.0;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }
    //圆柱的体积
    public double findVolume() {
        return Math.PI * getRadius() * getRadius() * getLength();
    }
    //圆柱的表面积
    public double findArea(){
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }
}
