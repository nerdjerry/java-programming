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
}
