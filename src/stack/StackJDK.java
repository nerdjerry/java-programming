package stack;

import linkedlist.Employee;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class StackJDK {

    private Deque<Employee> stack;

    StackJDK() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public void print() {
        Iterator itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
