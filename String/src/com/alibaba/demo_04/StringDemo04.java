package com.alibaba.demo_04;

import java.util.Scanner;

public class StringDemo04 {
    public static void main(String[] args) {
        System.out.println("请输入要翻转的字符串：");

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();

            String str = Reverse.gao(s);

            System.out.println("翻转后的字符串是：" + str);
        }
    }
}
