package com.alibaba.Demo_01;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge() != o2.getAge()) {
                    return o1.getAge() - o2.getAge();
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

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
