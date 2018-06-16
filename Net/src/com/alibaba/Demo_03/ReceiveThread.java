package com.alibaba.Demo_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveThread implements Runnable {

    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try{
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
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
