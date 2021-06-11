package cn.ItTest.Basic.ToString;

/**
 * @Auther: Datalong
 * @Date: 2021/4/9 - 04 -09 -15:06
 * @Dscription:
 * @version: 1.0
 */
public class GeomertricObject implements Geomertricic{

    public static void main(String[] args) {
        Geomertricic test = new Geomertricic() {
            @Override
            public void GeomertricObject() {
                System.out.println();
            }
        };
    }

    protected String color;
    protected double weight;

    public GeomertricObject() {
        super();
        this.color = "white";
        this.weight = weight;

        Integer x = 2; //装箱 调用了Integer.valueOf(2)
        int y = x; //拆箱 调用了x.intValue()
    }
}
interface Geomertricic{
   public default void GeomertricObject(){
        int a = 11;
        int b = 6;
       System.out.println(a*b);
    }
}
