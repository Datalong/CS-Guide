package jichu02.Socket.TCPLogin;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Auther: Datalong
 * @Date: 2021/7/3 - 07 -03 -18:50
 * @Dscription:
 * @version: 1.0
 */
public class LoginClient {
    public static void main(String[] args) throws IOException {
        //1 创建一个Socket 指明服务器端ip和监听端口
        Socket socket = new Socket(InetAddress.getLocalHost(),8800);

        //2 TCP发送数据用流来实现,而流指向socket
       OutputStream os = socket.getOutputStream();
       DataOutputStream dos = new DataOutputStream(os);
       dos.writeUTF("username=bjsxt&password=bjxst");

       //3 关闭资源
        dos.close();
        os.close();
        socket.close();
    }
}
