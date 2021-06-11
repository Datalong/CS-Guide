package jichu03.java_Bean.Java_Bean;


/**
 * @Auther: Datalong
 * @Date: 2021/3/1 - 03 -01 -10:18
 * @Dscription: jichu03.java_Bean
 * @version: 1.0
 */
public class DemoStudent {

    public static void main(String[] args) {
        Ssudent_Bean stu = new Ssudent_Bean();
        Ssudent_Bean stu2 = new Ssudent_Bean();

        stu2.setName("李易峰");
        stu2.setAge(18);
        stu.setName("迪丽热巴");
        stu.setAge(20);



        System.out.println("姓名："+stu.getName()+"年龄："+stu.getAge());
        System.out.println("--------------------");
        //姓名和年龄同时放进去
        Ssudent_Bean stu1 =new Ssudent_Bean("古力娜扎",21);
        System.out.println("姓名："+stu1.getName()+" 年龄："+stu1.getAge());

        stu1.setAge(22);
        System.out.println("姓名："+stu1.getName()+" 年龄："+stu1.getAge());
    }
}
