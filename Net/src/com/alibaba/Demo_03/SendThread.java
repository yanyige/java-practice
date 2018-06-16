package com.alibaba.Demo_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {

    private DatagramSocket ds;

    public SendThread(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = null;
            InetAddress address = InetAddress.getByName("10.88.255.255");
            int port = 12345;
            while ((str = br.readLine()) != null) {
                if (str.equals("end")) {
                    break;
                }
                DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, address, port);
                ds.send(dp);
            }
            ds.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
