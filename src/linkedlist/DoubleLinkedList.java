package linkedlist;

public class DoubleLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size = 0;

    public void insertAtFront(Employee employee) {
        EmployeeNode newEmployee = new EmployeeNode(employee);
        if (head != null) {
            newEmployee.setNext(head);
            newEmployee.setPrev(null);
            head.setPrev(newEmployee);
        } else {
            tail = newEmployee;
        }
        head = newEmployee;
        this.size += 1;
    }

    public void insertAtEnd(Employee employee) {
        EmployeeNode newEmployee = new EmployeeNode(employee);
        if (tail != null) {
            newEmployee.setPrev(tail);
            newEmployee.setNext(null);
            tail.setNext(newEmployee);
        } else {
            head = newEmployee;
        }
        tail = newEmployee;
        this.size += 1;
    }

    public EmployeeNode removeFromFront() {
        EmployeeNode removedNode = head;
        head = removedNode.getNext();
        head.setPrev(null);
        removedNode.setNext(null);
        this.size -= 1;
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        EmployeeNode removedNode = tail;
        tail = removedNode.getPrev();
        tail.setNext(null);
        removedNode.setPrev(null);
        this.size -= 1;
        return removedNode;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void printFromStart() {
        EmployeeNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getEmployee());
            System.out.print("->");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }

    public void printFromEnd() {
        EmployeeNode currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.getEmployee());
            System.out.print("->");
            currentNode = currentNode.getPrev();
        }
        System.out.println("null");
    }
}
