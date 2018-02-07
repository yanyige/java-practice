package com.alibaba.demo_03;

public class Judge {
    private Judge() {}
    public static void gao(String str) {
        int numCount = 0;
        int scharCount = 0;
        int bcharCount = 0;

        for(int i = 0; i < str.length(); i ++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount ++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                scharCount ++;
            } else {
                bcharCount ++;
            }
        }

        System.out.println("输入的字符串中有" + numCount + "个数字， 有" + scharCount + "个小写字母， 有" + bcharCount + "个大写字母。");
    }
}
