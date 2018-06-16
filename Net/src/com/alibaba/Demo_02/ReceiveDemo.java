package com.alibaba.Demo_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] b = new byte[1024];

        DatagramPacket dp = new DatagramPacket(b, b.length);

        while(true) {
            ds.receive(dp);
            byte[] ret = dp.getData();
            int len = dp.getLength();
            String res = new String(ret, 0, len);
            InetAddress address = dp.getAddress();
            String ip = address.getHostAddress();
            System.out.println(ip + " " + res);
        }
    }
}
