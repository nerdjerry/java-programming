package queue;

import java.util.PriorityQueue;

public class PriorityQueueMain {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(13);
        pq.add(23);
        pq.add(91);
        pq.add(45);
        pq.add(12);
        System.out.println(pq.peek());
        System.out.println(pq.remove(12));
        Object[] queue = pq.toArray();
        for (Object element : queue) {
            System.out.println((Integer) element);
        }
    }
}
