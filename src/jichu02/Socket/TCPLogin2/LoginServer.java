package jichu02.Socket.TCPLogin2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Datalong
 * @Date: 2021/7/3 - 07 -03 -18:49
 * @Dscription:登录的服务端
 * @version: 1.0
 */
public class LoginServer {
    public static void main(String[] args) throws IOException {
        //1 创建一个ServerSocKet
        ServerSocket serverSocket = new ServerSocket(8800);

        //2 使用ServerSocket在指定的端口监听
        Socket socket = serverSocket.accept();//请求不到阻塞，请求来了返回一个socket

        //3 接收客户端的请求数据并输出
        InputStream is = socket.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String info = dis.readUTF();
        System.out.println("来自客户端的请求："+info);

        //3 关闭资源
        dis.close();
        is.close();
        socket.close();
        serverSocket.close();
        System.out.println(socket.isClosed());
        System.out.println(serverSocket.isClosed());
    }
}
