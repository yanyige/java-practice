package com.alibaba.Demo_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        byte[] ret = new byte[1024];
        int len = is.read(ret);
        String str = new String(ret, 0, len);
        System.out.println(s.getInetAddress().getHostAddress() + ":" + str);

        OutputStream os = s.getOutputStream();
        os.write("data has been accepted!".getBytes());

        os.close();
        is.close();
        s.close();
    }
}
