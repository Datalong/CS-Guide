package Project1;

/**
 * @Auther: Datalong
 * @Date: 2021/3/18 - 03 -18 -16:09
 * @Dscription: 整体框架搭建
 * @version: 1.0
 */
public class FamilyAccount {

    public static void main(String[] args) {

        boolean isFlag = true;
        String details = "收支\t账户金额\t收支金额\t说   明\n"; //用它来记录用户的收支详情
        //初始金额
        int balance = 10000;

        while(isFlag){

            System.out.println("----------------家庭收支记账软件---------------\n");
            System.out.println("                  1 收支明细");
            System.out.println("                  2 登记收入");
            System.out.println("                  3 登记支出");
            System.out.println("                  4 退    出\n");
            System.out.print("                    请选择(1-4):");
            //获取用户的选择：1-4
            char selection = Utility.readMenuSelection();

            switch(selection){ //每种结果不一样就用分支来写 原函数返回的是字符

                case '1':
                    //System.out.println("1. 收支明细");
                    System.out.println("--------------当前收支明细记录---------------");
                    System.out.println(details);//用details记录用户的收支
                    System.out.println("-------------------------------------------");

                    break;
                case '2':
                    //System.out.println("2. 登记收入");
                    System.out.print("本次收入金额：");
                    int money = Utility.readNumber();
                    System.out.print("本次收入说明：");
                  String info = Utility.readString();

                  //处理balance
                    balance += money;

                  //处理details详情
                    details += ("收入\t" + balance + "\t" + money + "\t" + info + "\n");//怕优先级有问题，我们加一个括号 再加details会有一个换行
                    System.out.print("----------------登记完成------------------\n");
                    break;
                case '3':
                    //System.out.println("3. 登记支出");

                    System.out.print("本次支出金额：");
                    int money1 = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String info1 = Utility.readString();

                    //处理balance 余额
                    if(balance >= money1){//才能保证你支出
                        balance -= money1;//如果账户的够

                        details += ("支出\t" + balance + "\t\t" + money1 + "\t\t" + info1 + "\n");
                    }else{
                        System.out.println("超出支出额度，支付失败");
                    }

                    System.out.print("----------------登记完成------------------\n");
                    break;
                case '4':

                    //System.out.println("4. 退    出");
                    System.out.print("确认是否退出(Y/N)：");

                    char isExit = Utility.readConfirmSeletion();

                    if(isExit == 'Y'){
                        isFlag = false;//break
                    }

                    break;//用户不用判断else 结果为n自动结束当前继续循环
            }
        }
    }
}
