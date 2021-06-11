package cn.ItTest.Basic.Interface;

/**
 * @Auther: Datalong
 * @Date: 2021/3/10 - 03 -10 -7:34
 * @Dscription: cn.ItTest.Basic.Interface
 * @version: 1.0
 */

interface LongGoodJob{
//还有一种访问权限符 default只具有包访问
    static void xuexi(){
        System.out.println("xuexi nuli");
    }
    void Dalaolong();

    void DalaoXing();

}

class LongStudyWell implements LongGoodJob{


    public void studyWell(){
        System.out.println("学习好嘛");
    }

    @Override
    public void Dalaolong() {
    }

    @Override
    public void DalaoXing() {
        System.out.println("大佬是流星");
    }

}

class Daolao implements LongGoodJob {
    public static void Daolaolong(){
        System.out.println("Datalong niubi");
    }

    @Override
    public void Dalaolong() {
        System.out.println("Datalong niubi ghugbh");
    }

    @Override
    public void DalaoXing() {

    }
}
//抽象类
interface Dog{

    void FunColor();
}

    abstract class WriteDog implements Dog{

        public void FunCollor(){
            System.out.println("fun is write");
        }

        int age;
        public void Age() {
            System.out.println("This age is "+age);
        }

        abstract void SmallBody();
    }
public class Interface{
    public static void main(String[]args){

        Daolao.Daolaolong();
        LongGoodJob.xuexi();
    }
}




