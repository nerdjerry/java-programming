package stack;

import linkedlist.Employee;

public class Main {

    public static void main(String[] args) {
        StackLinkedList stackArray = new StackLinkedList();
        Employee charlie = new Employee("Charlie", "John", 123);
        Employee alpha = new Employee("Alpha", "Man", 234);
        Employee sara = new Employee("Sara", "Khan", 32);
        stackArray.push(charlie);
        stackArray.push(alpha);
        stackArray.push(sara);
        System.out.println(stackArray.peak());
        System.out.println(stackArray.pop());
        stackArray.print();
    }
}
