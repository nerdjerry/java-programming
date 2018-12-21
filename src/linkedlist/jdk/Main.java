package linkedlist.jdk;

public class Main {
    public static void main(String[] args) {
        LinkedListSorted list = new LinkedListSorted();
        list.insertSorted(4);
        list.insertSorted(6);
        list.insertSorted(2);
        list.insertSorted(8);
        list.print();
    }
}
