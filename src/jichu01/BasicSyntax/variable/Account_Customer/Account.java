package jichu01.BasicSyntax.variable.Account_Customer;

/**
 * @Auther: Datalong
 * @Date: 2021/3/23 - 03 -23 -9:51
 * @Dscription: jichu01.BasicSyntax.variable.Account_Customer
 * @version: 1.0
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率
    private int address;
    private int passwrod;

    Account(int id, double balance, double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
        this.id = id;
        this.balance = balance;
    }

    public Account() {

    }

    public void setPasswrod(int passwrod){
        this.passwrod = passwrod;
    }

    public int getPasswrod(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println(balance);
    }

    public double getBalance() {
        return balance;
    }

public double getAnnualInterestRate(){
        return annualInterestRate;
}

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        System.out.println(annualInterestRate);
    }

    public void withdraw (double amout){
        this.balance = amout;
    }
}
class Person{
    private String name;
    private double top_blance;

    public void goOut(){
        System.out.println("主人，开始出门了");
    }

    public void driver(){
       Account driver = new Account();

    }

    public void car(){
        System.out.println("driver正在开车\n");
    }
}