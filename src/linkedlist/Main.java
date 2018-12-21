package linkedlist;

public class Main {

    public static void main(String[] args) {
        Employee charlie = new Employee("Charlie", "John", 123);
        Employee alpha = new Employee("Alpha", "Man", 234);
        Employee sara = new Employee("Sara", "Khan", 32);

        DoubleLinkedList list = new DoubleLinkedList();
        list.insertAtFront(charlie);
        list.insertAtFront(alpha);
        list.insertAtFront(sara);

        list.printFromStart();
        Employee Aditi = new Employee("Aditi", "Aggarwal", 32);
        list.addBefore(Aditi, alpha);
        list.printFromStart();
        System.out.println(list.removeFromFront().getEmployee());

        list.printFromStart();
        System.out.println(list.removeFromFront().getEmployee());
        list.printFromStart();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
    }
}
