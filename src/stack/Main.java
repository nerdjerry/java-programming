package stack;

import linkedlist.Employee;

public class Main {

    public static void main(String[] args) {
        StackJDK stackArray = new StackJDK();
        Employee charlie = new Employee("Charlie", "John", 123);
        Employee alpha = new Employee("Alpha", "Man", 234);
        Employee sara = new Employee("Sara", "Khan", 32);
        stackArray.push(charlie);
        stackArray.push(alpha);
        stackArray.push(sara);
        System.out.println(stackArray.peek());
        System.out.println(stackArray.pop());
        stackArray.print();
    }
}
