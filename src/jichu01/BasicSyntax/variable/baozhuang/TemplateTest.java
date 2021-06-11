package jichu01.BasicSyntax.variable.baozhuang;

/**
 * @Auther: Datalong
 * @Date: 2021/4/14 - 04 -14 -17:57
 * @Dscription: 模板方法的设计模式及应用场景
 * @version: 1.0

public class TemplateTest {

    public static void main(String[] args) {
        SubTemplate t = new SubTemplate();//造了一个子类对象

        t.spendTime();//走到code 不可能是抽象方法（重写了）
        }
    private int age;
}

abstract class  Template {

    Template T = new Template() {

        public abstract void code();
        @Override
        public void code() {

        }


        public void  spendTime() {//整体speedTime流程是固定的 :计算某段代码所花费的时间

            long start = System.currentTimeMillis();
            this.code();//code代码这部分就是不确定的
            long end = System.currentTimeMillis();

            System.out.println("花费的时间为："+(end-start));
        }
    };


    public abstract void spendTime();
}

class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i=2; i<1000; i++){
            boolean isFlag = true;//每次进来要加载，咱们就不重置了
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i % j == 0){
                    isFlag = false;//表明处尽了
                    break;//就别往下算
                }
            }
           if(isFlag) {//如果咱们没有进去，isFlag=true 说明咱就是质数
               System.out.println(i);
           }
        }

    }
}
 */