package jichu03.Super;

/**
 * @Auther: Datalong
 * @Date: 2021/4/9 - 04 -09 -18:57
 * @Dscription: jichu03.Super
 * @version: 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为："+volume);

        //重写findArea()以后
        double area = cy.findArea();
        System.out.println("圆柱的表面积："+area);

        System.out.println("************************");
        Cylinder cy1 = new Cylinder();//调用子类的空参构造器
        double volume1 = cy1.findVolume();
        System.out.println("圆柱的体积为："+volume1);//高度1
    }
}
