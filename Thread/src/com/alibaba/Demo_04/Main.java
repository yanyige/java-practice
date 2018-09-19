package com.alibaba.Demo_04;

public class Main implements Runnable {
    int tickets = 100;

    @Override
    public void run() {

        while(tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets --;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Runnable r = new Main();
        Thread t1 = new Thread(r, "窗口1");
        Thread t2 = new Thread(r, "窗口2");
        Thread t3 = new Thread(r, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
