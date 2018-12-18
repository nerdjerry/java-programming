package linkedlist.jdk;

import linkedlist.Employee;

import java.util.*;

public class LinkedListJDK {

    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();
        Employee charlie = new Employee("Charlie", "John", 123);
        Employee alpha = new Employee("Alpha", "Man", 234);
        Employee sara = new Employee("Sara", "Khan", 32);

        list.addFirst(charlie);
        list.addFirst(alpha);
        list.add(sara);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print("<->");
        }
        list.remove();
        list.removeLast();
        itr = list.iterator();
        System.out.println();
        while (itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print("<->");
        }
    }
}
