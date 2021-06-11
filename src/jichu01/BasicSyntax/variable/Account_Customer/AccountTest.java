package jichu01.BasicSyntax.variable.Account_Customer;

/**
 * @Auther: Datalong
 * @Date: 2021/4/6 - 04 -06 -19:51
 * @Dscription: jichu01.BasicSyntax.variable.Account_Customer
 * @version: 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setAnnualInterestRate(12.3);
        acc.getAnnualInterestRate();
        acc.setBalance(10.5);
        acc.getBalance();
    }
}
