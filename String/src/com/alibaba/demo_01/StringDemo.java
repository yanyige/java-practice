package com.alibaba.demo_01;

import java.util.Scanner;

public class StringDemo {
    static String username = "yyg";
    static String password = "123";
    public static void main(String[] args) {
        int chances = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");

        while(sc.hasNextLine()) {

            if(chances == 0) {
                System.out.println("登陆失败，请联系管理员。");
                break;
            }

            String usr = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            if(usr.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功！");
                break;
            } else {
                System.out.println("登陆失败！你还有" + chances + "次机会！");
                chances --;
            }
        }
    }
}
