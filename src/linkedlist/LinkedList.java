package linkedlist;

public class LinkedList {

    private EmployeeNode head;
    private int size = 0;

    public void insertAtFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
        this.size += 1;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = removedNode.getNext();
        removedNode.setNext(null);
        this.size -= 1;
        return removedNode;
    }

    public boolean addBefore(Employee newEmployee, Employee employee) {
        EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
        EmployeeNode current = this.head;
        if (isEmpty()) {
            return false;
        }
        if (current.getEmployee() == employee) {
            newEmployeeNode.setNext(current);
            this.head = newEmployeeNode;
            return true;
        }
        while (current.getNext().getEmployee() != employee) {
            current = current.getNext();
        }
        if (current.getNext().getEmployee() == employee) {
            newEmployeeNode.setNext(current.getNext());
            current.setNext(newEmployeeNode);
            return true;
        }
        return false;
    }
    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
    public void print() {
        EmployeeNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getEmployee());
            System.out.print("->");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }

    public Employee getHead() {
        return this.head.employee;
    }
}
