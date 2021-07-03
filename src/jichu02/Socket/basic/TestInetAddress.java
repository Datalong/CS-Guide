package jichu02.Socket.basic;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @Auther: Datalong
 * @Date: 2021/7/3 - 07 -03 -18:14
 * @Dscription: InetAddress 封装了IP地址
 * @version: 1.0
 */
public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {

        //获取IP地址
        //InetAddress ia = InetAddress.getLocalHost();
        InetAddress ia = InetAddress.getByName("www.mi.com");

        //操作IP地址
        System.out.println(ia);
        System.out.println(ia.getHostAddress());
        System.out.println(ia.getHostName());
        System.out.println(Arrays.toString(ia.getAddress()));
    }
}
