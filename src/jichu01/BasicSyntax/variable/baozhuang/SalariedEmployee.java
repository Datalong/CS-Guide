package jichu01.BasicSyntax.variable.baozhuang;

/**
 * @Auther: Datalong
 * @Date: 2021/4/14 - 04 -14 -21:06
 * @Dscription:
 * @version: 1.0
 */
public class SalariedEmployee extends Employee{
    public SalariedEmployee() {
        super();
    }//Employee没有空参构造器 而此类默认空参构造器调super()

    public static void main(String[] args) {
        SalariedEmployee test = new SalariedEmployee();
        test.MonthSalary();
    }

    private Double MonthSalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public Double getMonthSalary() {
        return MonthSalary;
    }

    public void setMonthSalary(Double monthSalary) {
        MonthSalary = monthSalary;
    }

    @Override
    public Double earnings() {//重写抽象父类的抽象方法
        return MonthSalary;
    }

    @Override
    protected Double MonthSalary() {
        return MonthSalary;
    }

    @Override
    public String toString() {//用父类中的非抽象方法
        return "SalariedEmployee{" +
                super.toString() +
                '}';
    }
}
