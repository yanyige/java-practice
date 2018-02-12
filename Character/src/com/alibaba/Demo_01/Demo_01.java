package com.alibaba.Demo_01;

import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        while(sc.hasNextLine()) {
            char c = sc.nextLine().toCharArray()[0];
            if(Character.isUpperCase(c)) {
                System.out.println("你输入的是大写字符！");
            } else {
                System.out.println("你输入的是小写字符！");
            }
            System.out.println("请重新输入！");
        }
    }
}
