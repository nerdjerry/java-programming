package linkedlist;

public class Main {

    public static void main(String[] args) {
        Employee charlie = new Employee("Charlie", "John", 123);
        Employee alpha = new Employee("Alpha", "Man", 234);
        Employee sara = new Employee("Sara", "Khan", 32);

        LinkedList list = new LinkedList();
        list.insertAtFront(charlie);
        list.insertAtFront(alpha);
        list.insertAtFront(sara);

        list.print();

        System.out.println(list.removeFromFront().getEmployee());

        list.print();
    }
}
