package com.alibaba.InetAddressDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {



    public static void main(String[] args) throws IOException {
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        Boolean reachable = ip.isReachable(100);
        System.out.println("ip: " + " " + ip);
        System.out.println("Reachable: " + " " + reachable);
        System.out.println("ip name: " + " " + ip.getCanonicalHostName());

        InetAddress local = InetAddress.getByAddress(new byte[]{127,0,0,1});
        reachable = local.isReachable(100);
        System.out.println("local ip " + local);
        System.out.println("local reachable: " + " " + reachable);
        System.out.println("local name: " + " " + local.getCanonicalHostName());
    }
}
