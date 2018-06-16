package com.alibaba.Demo_04;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("who");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
