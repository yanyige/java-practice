package com.alibaba.search.constructor;

public class Constructor {

    private int age;
    private String name;

    public Constructor() {

    }

    public Constructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor a = new Constructor();
        Constructor b = new Constructor(20, "yyg");
        System.out.println(a.age + "   " + a.name);
        System.out.println(b.age + "   " + b.name);
    }

}
