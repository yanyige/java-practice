package com.alibaba.Demo_02;

import com.alibaba.Demo_01.Student;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        ts.add(new Student("yyg", 21));
        ts.add(new Student("xixibaba", 22));
        ts.add(new Student("a", 12));
        ts.add(new Student("a", 13));
        ts.add(new Student("b", 13));
        ts.add(new Student("bb", 13));
        ts.add(new Student("bb", 13));

        for(Student s : ts) {
            System.out.println(s);
        }

    }
}
