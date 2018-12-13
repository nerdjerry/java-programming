package linkedlist;

public class DoubleLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;

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
    }

    public EmployeeNode removeFromFront() {
        EmployeeNode removedNode = head;
        head = removedNode.getNext();
        head.setPrev(null);
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        EmployeeNode removedNode = tail;
        tail = removedNode.getPrev();
        tail.setNext(null);
        removedNode.setPrev(null);
        return removedNode;
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
