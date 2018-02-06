package com.alibaba.demo_02;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello, please input a number1:");

        while(true) {
            String temp1 = sc.nextLine();
            String temp2 = sc.nextLine();

            System.out.println("temp1: " + temp1 + " temp2: " + temp2);
        }

    }
}
