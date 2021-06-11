package jichu02.Test01;

/**
 * @Auther: Datalong
 * @Date: 2021/4/19 - 04 -19 -8:58
 * @Dscription: 设计一个类代表二维空间的一个点
 * @version: 1.0
 */
public class ErWei_point {

    private int x;
    private int y;

    public static void main(String[] args) {
        ErWei_point test = new ErWei_point();
        test.setX(1);
        test.setY(1);

        new ErWei_point();
    }
    public void setX(int x) {
        this.x=x;
    }
    public int getX() {
        return this.x;
    }
    public void setY(int y) {
        this.y=y;
    }
    public int getY() {
        return this.y;
    }

    public ErWei_point(){

    }
    public ErWei_point(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
