package com.alibaba.Demo_03;

public class Main extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 10; i ++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Main tp1 = new Main();
        Main tp2 = new Main();
        Main tp3 = new Main();

        tp1.setName("yige");
        tp2.setName("gengu");
        tp3.setName("hehe");

        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());

        tp1.setPriority(1);
        tp3.setPriority(10);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}