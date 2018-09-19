package com.alibaba.Demo_01;

public class MyThread extends Thread {
    private int i;
    public void run() {
        for(i = 0 ; i < 100 ; i ++) {
            System.out.println(getName() + "*" + i);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + "=" + i);
            if(i == 20) {
                new MyThread().start();
                new MyThread().start();
            }
        }
    }
}
