package cn.ItTest.Basic.daili;

/**
 * @Auther: Datalong
 * @Date: 2021/3/7 - 03 -07 -6:55
 * @Dscription: 组合不具备多态和向上转型 继承是多态的基础，可以实现向上转型 组合是运行时绑定
 * @version: 1.0
 */
public class zuhe {

   private int itr = 0;
   private String str;

   zuhe(){
       System.out.println("组合构造器调用");
   }

    public static class SoccerPlayer{//静态内部类

        public static void main(String[] args) {

            SoccerPlayer player = new SoccerPlayer();

            player.Internetplayer("肖云川",01);
        }



        private String name;
        private int number;

        public void Internetplayer(String name, int number){
            this.name = name;
            this.number = number;

            System.out.println("球员信息姓名："+name+",编号是："+number);
        }

    }
}

class Soccer{
    private String soccerName;
}
//代理，A想调用B类的方法，A它不直接调用，A会在自己的类中创建一个B对象的代理，再由代理调用B的方法
class Destination{//B

    public void todo(){
        System.out.println("control...");
    }

    private String Device;

    public void todo1(String Device){

    }
}

class Device{//1A

    private String name;
    private Destination destination;
    private DeviceController deviceController;
    private Device device;

    public void control1(DeviceController deviceController){
        deviceController.control1(device);//1A调用1A的control1
    }

    public void control(Destination destination){
        destination.todo();
    }
}

class DeviceController{//2A

   private Device device;//调用第二个A中的Control
    private Destination destination;

    public void control(Destination destination){
        destination.todo();
    }

    public void control1(Device device){
        device.control(destination);//2A调用1A的control
    }
}