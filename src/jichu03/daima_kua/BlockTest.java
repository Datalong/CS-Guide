package jichu03.daima_kua;
/**
 * @Auther: Datalong
 * @Date: 2021/4/1 - 04 -01 -18:54
 * @Dscription: 代码块
 * @version: 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
       String desc = Person1.desc;
        System.out.println(desc);

       Person1 p1 = new Person1();
       Person1 p2 = new Person1();
        System.out.println(p1.age);

    }
}
     class Person1{
        String name;
        int age;
       static String desc = "我是一个人";

        public void Person(){

        }
        //代码块的作用：初始化类或者对象；只能static修饰 静态代码块（执行了一次（类加载））：静态方法（没执行）都会随着类初始化加载而加载  非静态代码块不会执行因为多个对象调用多次执行
         //非静态代码块可以在创建对象是，对对象的属性进行初始化 因为每造一个的对象都要考虑属性，都执行一次
         /*对象的赋值位置：
         * 默认初始化
         * 显式初始化
         * 构造器初始化
         * 有了对象以后，可以通过对象，属性或对象，方法的方式，进行赋值
         * 在代码块中赋值
         *
         * 静态代码块的执行优于非静态代码块的执行
         * 非静态结构可以调用静态结构的代码
         * */
        static{
            System.out.println("hello,static block-1");
            desc = "我是爱学习的人";
        }

        static{
            System.out.println("hello,static block-2");
            desc = "我是爱学习的人";
        }

         {
             System.out.println();
             age = 1;
         }

        public void Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public static void info(){
            System.out.println("我是一个快乐的人");
        }

        public void eat(){
            System.out.println("吃饭");
        }
        @Override
        public String toString() {
            return "Perosn{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }



