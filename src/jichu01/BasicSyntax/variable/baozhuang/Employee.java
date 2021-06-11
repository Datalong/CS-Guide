package jichu01.BasicSyntax.variable.baozhuang;

/**
 * @Auther: Datalong
 * @Date: 2021/4/14 - 04 -14 -20:42
 * @Dscription: 简单的工资系统
 * @version: 1.0
 */
public abstract class Employee {

    private int number;
    private String name;
    private MyDate birthday;

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    public Employee(String name, int number, MyDate birthday){
        super();
        this.name = name;
        this.number= number;
        this.birthday = birthday;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract Double earnings();

    protected abstract Double MonthSalary();
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public String toDateString() {
        return year+"年"+month+"月"+day+"日";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
