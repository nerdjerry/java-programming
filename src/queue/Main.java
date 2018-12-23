package queue;

public class Main {

    public static void main(String[] args) {
        QueueArray<Integer> queue = new QueueArray<>(10);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(0);
        queue.print();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peak());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
