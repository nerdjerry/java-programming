package linkedlist;

public class LinkedList {

    private EmployeeNode head;

    public void insertAtFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    public EmployeeNode removeFromFront() {
        EmployeeNode removedNode = head;
        head = removedNode.getNext();
        removedNode.setNext(null);
        return removedNode;
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
}
