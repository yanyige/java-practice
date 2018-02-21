package com.alibaba.Demo_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LiveDays01 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你出生的年月，用YYYY-MM-DD表示：");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String in = sc.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date d = new Date();
            Date dd = sdf.parse(in);

            long nowTime = d.getTime();
            long lastTime = dd.getTime();

            int day = (int)((nowTime - lastTime) / 1000 / 60 / 60 / 24);

            System.out.println("你已经来到这个世界" + day + "天了！请重新输入！");
        }
    }
}
