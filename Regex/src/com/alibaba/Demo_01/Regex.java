package com.alibaba.Demo_01;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        String reg = "\\w+@\\w{1,6}(\\.\\w{2,3})+";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的邮箱：");
        while(sc.hasNextLine()) {
            String email = sc.nextLine();
            boolean flag = email.matches(reg);
            if(flag) {
                System.out.println("合法");
            } else {
                System.out.println("不合法");
            }
        }
    }
}
