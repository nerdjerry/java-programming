package queue;

public class CircularQueue {

    private int front;
    private int back;
    private int capacity;
    private int[] queue;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[this.capacity];
        this.front = 0;
        this.back = -1;
    }

    public void add(int value) {
        if (this.size() == this.capacity) {
            //Resize and straighten queue
            int[] temp = new int[this.capacity * 2];
            int i = 0;
            int j = this.front;
            while (i < this.capacity) {
                temp[i] = queue[j];
                i += 1;
                j = (j + 1) % capacity;
            }
            this.back = this.capacity - 1;
            this.front = 0;
            this.queue = temp;
            this.capacity *= 2;
        }
        this.back = (this.back + 1) % this.capacity;
        this.queue[this.back] = value;
    }

    public int remove() {
        if (this.isEmpty()) {
            return -1;
        }
        int value = this.queue[front];
        this.queue[front] = 0;
        front = (front + 1) % capacity;
        if (this.isEmpty()) {
            this.front = 0;
            this.back = 0;
        }
        return value;
    }

    public int peak() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    private boolean isEmpty() {
        return size() == 0;
    }


    public int size() {
        if (back == -1) {
            return 0;
        }
        if (back >= front) {
            return back - front;
        } else {
            return back - front + capacity;
        }
    }

    public void print() {
        int count = 0;
        int j = front;
        int size = size();
        while (count <= size) {
            System.out.print(queue[j] + " ");
            j = (j + 1) % capacity;
            count += 1;
        }
        System.out.println();
    }
}
