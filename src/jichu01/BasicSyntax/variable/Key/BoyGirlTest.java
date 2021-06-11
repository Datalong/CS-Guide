package jichu01.BasicSyntax.variable.Key;

/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -9:30
 * @Dscription: jichu01.BasicSyntax.variable.Key
 * @version: 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy = new Boy("肖云川",23);
        boy.shout();

        Girl girl2 = new Girl();

        Boy boy1 = new Boy("刘大兴",2);
        boy1.RIPE(boy1,girl2);

        Girl girl = new Girl("刘兴",99);
        girl.marry(boy);

        Girl girl1 = new Girl("小宝",100);
        int compare1 = girl.compare(girl1);
        if(compare1 > 0){
            System.out.println(girl.getName() + "大");
        }else if(compare1 < 0){//形参的那个大
            System.out.println(girl1.getName()+ "大") ;
        }else{
            System.out.println("她俩一样大");
        }

    }
}
