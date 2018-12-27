package queue;

public class Main {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.add(5);
        queue.add(6);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        queue.remove();
        queue.add(1);
        queue.print();
    }
}
