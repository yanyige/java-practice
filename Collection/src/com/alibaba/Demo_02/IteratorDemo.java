package com.alibaba.Demo_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("yyg", 12,"jingmen");
        Student s2 = new Student("zsn", 11, "riben");
        Student s3 = new Student("haha", 1, "xibanya");

        Collection c = new ArrayList();

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator it = c.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
