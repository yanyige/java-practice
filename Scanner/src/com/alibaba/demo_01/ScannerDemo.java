package com.alibaba.demo_01;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello, please input a number:");
        while(sc.hasNextInt()) {
            int temp = sc.nextInt();
            System.out.println("temp: " + temp);
        }


    }
}
