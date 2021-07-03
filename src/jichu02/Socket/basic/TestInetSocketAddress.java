package jichu02.Socket.basic;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @Auther: Datalong
 * @Date: 2021/7/3 - 07 -03 -18:16
 * @Dscription: 封装了IP和port
 * @version: 1.0
 */
public class TestInetSocketAddress {
    public static void main(String[] args) throws UnknownHostException {
    //获取
       // InetSocketAddress ina = new InetSocketAddress("www.mi.com", 8888);
        InetAddress ia = InetAddress.getByName("www.mi.com");
        InetSocketAddress isa = new InetSocketAddress(ia, 8888);

        //获取InetSocketAddress的内容
        System.out.println(isa);
        System.out.println(isa.getAddress());
        System.out.println(isa.getPort());
    }
}
