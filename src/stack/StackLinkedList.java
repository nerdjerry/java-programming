package stack;

import linkedlist.Employee;
import linkedlist.LinkedList;

public class StackLinkedList {

    LinkedList stack;

    StackLinkedList() {
        stack = new LinkedList();
    }

    public void push(Employee employee) {
        stack.insertAtFront(employee);
    }

    public Employee peak() {
        return stack.getHead();
    }

    public void print() {
        stack.print();
    }

    public Employee pop() {
        return stack.removeFromFront().getEmployee();
    }
}
