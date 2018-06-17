package com.alibaba.Demo_04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
    /*
     * TCP连接
     * 创建Socket对象
     *
     */
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getByName("10.88.235.50"), 16800);

        OutputStream ost = s.getOutputStream();
        ost.write("haha".getBytes());

        s.close();
    }
}
