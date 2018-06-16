package com.alibaba.Demo_02;
/*
 * UDP发送数据
 * 创建Socket
 * 创建数据，并把数据打包
 * 发数据
 * 释放资源
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress address = InetAddress.getByName("10.88.255.255");
        int port = 10086;
        boolean flag = false;

//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()) {
//            String str = sc.next();
//            if(str.equals("end")) {
//                flag = true;
//                break;
//            }
//            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, address, port);
//            ds.send(dp);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str = br.readLine()) != null) {
            if(str.equals("end")) {
                flag = true;
                break;
            }
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.getBytes().length, address, port);
            ds.send(dp);
        }

        ds.close();
    }
}
