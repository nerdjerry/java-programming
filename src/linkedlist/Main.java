package linkedlist;

public class Main {

    public static void main(String[] args) {
        Employee charlie = new Employee("Charlie", "John", 123);
        Employee alpha = new Employee("Alpha", "Man", 234);
        Employee sara = new Employee("Sara", "Khan", 32);

        CircularLinkedList list = new CircularLinkedList();
        list.addFront(charlie);
        list.addFront(alpha);
        list.addFront(sara);

        list.print();

        System.out.println(list.removeFront());

        list.print();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
    }
}
