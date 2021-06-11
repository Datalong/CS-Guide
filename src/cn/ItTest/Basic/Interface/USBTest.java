package cn.ItTest.Basic.Interface;

/**
 * @Auther: Datalong
 * @Date: 2021/5/31 - 05 -31 -19:10
 * @Dscription: cn.ItTest.Basic.Interface
 * @version: 1.0
 */
public class USBTest {
    public static void main(String[] args) {

        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);

    }
}

interface USB {
    // 定义了长， 宽， 最大最小的传输速度等
    void start();

    void stop();
}

class Computer {
    public void transferData(USB usb) {
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }
}

class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}
