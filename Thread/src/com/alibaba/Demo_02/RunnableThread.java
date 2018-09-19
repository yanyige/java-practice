package com.alibaba.Demo_02;

public class RunnableThread implements Runnable{
    private int i;
    public void run() {
        for( ; i < 100 ; i ++) {
            System.out.println(Thread.currentThread().getName() + "*" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + "=" + i);
//            Thread.sleep(1);
            if(i == 20) {
                RunnableThread st = new RunnableThread();
                new Thread(st, "a1").start();
                new Thread(st, "a2").start();
            }
        }
    }
}
