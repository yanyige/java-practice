package com.alibaba.Demo_04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(16800);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();

        byte[] ret = new byte[1024];

        int len = is.read(ret);

        System.out.println(s.getInetAddress().getHostAddress() + " " + new String(ret, 0, len));
    }
}
