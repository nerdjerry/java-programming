package linkedlist;

public class Main {

    public static void main(String[] args) {
        Employee charlie = new Employee("Charlie", "John", 123);
        Employee alpha = new Employee("Alpha", "Man", 234);
        Employee sara = new Employee("Sara", "Khan", 32);

        DoubleLinkedList list = new DoubleLinkedList();
        list.insertAtEnd(charlie);
        list.insertAtEnd(alpha);
        list.insertAtEnd(sara);

        list.printFromStart();

        System.out.println(list.removeFromEnd().getEmployee());

        list.printFromEnd();
    }
}
