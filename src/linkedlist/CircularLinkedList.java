package linkedlist;

public class CircularLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        if (isEmpty()) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;
        tail.setNext(head);
        size += 1;

    }

    public Employee removeFront() {
        EmployeeNode removedNode;
        if (isEmpty()) {
            return null;
        } else if (head.getNext() == head) {
            removedNode = head;
            tail = null;
            head = null;
            removedNode.setNext(null);
        } else {
            removedNode = head;
            head = head.getNext();
            tail.setNext(head);
            removedNode.setNext(null);
        }
        size -= 1;
        return removedNode.getEmployee();

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        EmployeeNode current = head;
        do {
            System.out.print(current.getEmployee());
            current = current.getNext();
        } while (current != head);
        System.out.println("");
    }
}
