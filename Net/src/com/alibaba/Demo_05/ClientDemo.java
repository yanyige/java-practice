package com.alibaba.Demo_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket(InetAddress.getByName("10.88.235.50"), 10086);

        OutputStream ost = s.getOutputStream();
        ost.write("haha".getBytes());

        InputStream is = s.getInputStream();
        byte[] b = new byte[1024];
        int len = is.read(b);
        String str = new String(b, 0, len);

        System.out.println("client: " + str);

        s.close();
    }
}
