package jichu02.Socket.basic;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Auther: Datalong
 * @Date: 2021/7/3 - 07 -03 -18:17
 * @Dscription: 统一资源定位符，网络上资源的地址
 * @version: 1.0
 */
public class TestURL {
    public static void main(String[] args) throws MalformedURLException {
        //创建个URL
        URL url = new URL("https://www.bjsxt.com:90/news/11068.html#cloths");

        //获取URL的各个组成部分
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
        System.out.println(url.getRef());
        System.out.println(url.getDefaultPort());
    }

}
