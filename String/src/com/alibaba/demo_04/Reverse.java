package com.alibaba.demo_04;

public class Reverse {
    public static String gao(String str) {
        int length = str.length();
        char[] s = str.toCharArray();
        for(int i = 0; i < length >> 1; i ++) {
            s[i] ^= s[length - i - 1];
            s[length - i - 1] ^= s[i];
            s[i] ^= s[length - i - 1];
        }
        return new String(s);
    }
}
