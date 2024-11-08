package practice;

import java.util.List;
import java.util.ListIterator;

public class Driver {
    public static void main(String[] args) {
        Student s = new Student();
        Person p = s; // upcasting
        p.walk();
        p.speak();
//        p.read(); // CTE
        Student s1 = (Student) p; // down casting
        s1.walk();
//        ListIterator
        s1.speak();
//        Comparable
        s1.read(); // valid down casting
    }
}
