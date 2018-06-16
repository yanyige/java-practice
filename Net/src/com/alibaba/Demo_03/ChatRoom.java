package com.alibaba.Demo_03;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatRoom {

    public static void main(String[] args) throws SocketException {
        DatagramSocket ds = new DatagramSocket();
        DatagramSocket dst = new DatagramSocket(12345);


        SendThread st = new SendThread(ds);
        ReceiveThread rt = new ReceiveThread(dst);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(rt);

        t1.start();
        t2.start();
    }
}
