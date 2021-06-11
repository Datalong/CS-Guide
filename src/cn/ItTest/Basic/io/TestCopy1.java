package cn.ItTest.Basic.io;

import java.io.*;

/**
 * @Auther: Datalong
 * @Date: 2021/6/2 - 06 -02 -8:37
 * @Dscription: cn.ItTest.Basic.io
 * @version: 1.0
 */
public class TestCopy1 {
    public static void main(String[] args) throws IOException {
        //1 创建一个输入流和一个输出流
        File file;
        InputStream fis = new FileInputStream(new File("d:/redme.txt"));
        OutputStream fos = new FileOutputStream(new File("d:/redme.txt"));

        //2 使用输入流和输出流完成文件复制
        //2.1 准备一个中转站（水杯）
        int n;
        //2.2 先读一个字节
        n = fis.read();//读取一个字节，赋给n
        while (n != -1){
            //2.3 再写一个字节
            fos.write(n);

            //2.4 再读一个字节
            n = fis.read();
        }

        //3 关闭输入流和输出流
        fis.close();
        fos.close();
    }
}
