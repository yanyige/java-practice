package com.alibaba.Demo_03;

public class Student {
    public String name;
    public int age;

    private Student() {

    }

    private static Student s = new Student();

    public static Student getStudent() {
        return s;
    }
}
