package com.alibaba.demo_03;

import java.util.Scanner;

public class StringDemo03 {
    public static void main(String[] args) {
        System.out.println("请输入你要统计的字符串");

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            Judge.gao(s);
        }

    }
}
