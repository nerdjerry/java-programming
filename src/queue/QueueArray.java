package queue;

public class QueueArray<E> {

    private E[] queue;
    private int capacity;
    private int size;
    private int front;
    private int end;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.queue = (E[]) new Object[this.capacity];
        this.size = 0;
        this.front = 0;
        this.end = -1;
    }

    public void enqueue(E value) {
        this.end += 1;
        if (this.end == this.capacity) {
            E[] temp = (E[]) new Object[2 * this.capacity];
            for (int i = 0; i < this.capacity; i++) {
                temp[i] = this.queue[i];
            }
            this.capacity *= 2;
            this.queue = temp;
        }
        this.queue[this.end] = value;
        this.size += 1;
    }

    public E dequeue() {
        if (this.isEmpty()) {
            System.out.println("Empty Queue");
            return null;
        }
        E removed = this.queue[this.front];
        this.queue[this.front] = null;
        this.front += 1;
        this.size -= 1;
        if (this.isEmpty()) {
            this.front = 0;
            this.end = -1;
        }
        return removed;
    }

    public E peak() {
        if (this.isEmpty()) {
            System.out.println("Empty Queue");
            return null;
        }
        return this.queue[this.front];
    }

    public boolean isEmpty() {
        return this.front > this.end;
    }

    public void print() {
        for (int i = front; i <= end; i++) {
            System.out.print(this.queue[i] + " ");
        }
        System.out.println();
    }
}
