package jichu03.java_Bean.Java_Bean;

/**
 * @Auther: Datalong
 * @Date: 2021/3/1 - 03 -01 -10:13
 * @Dscription: jichu03.java_Bean
 * @version: 1.0
 */
public class Ssudent_Bean {

    private String name;
    private int age;

    public Ssudent_Bean() {
    }

    public Ssudent_Bean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
