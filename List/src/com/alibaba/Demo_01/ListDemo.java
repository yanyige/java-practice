package com.alibaba.Demo_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();

        Student s1 = new Student("yyg", 12);
        Student s2 = new Student("zsn", 11);
        Student s3 = new Student("haha", 10);

        l.add(s1);
        l.add(s2);
        l.add(s3);

        Iterator it = l.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
