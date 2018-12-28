package stack;

public class StackArray {

    private int length;
    private int[] data;
    private int head;

    public StackArray(int capacity) {
        length = capacity;
        data = new int[length];
        head = -1;
    }

    public void push(int value) {
        if (head >= length - 1) {
            int[] temp = new int[2 * length];
            for (int i = 0; i < length; i++) {
                temp[i] = data[i];
            }
            length *= 2;
            data = temp;
        }
        head += 1;
        data[head] = value;
    }

    public int pop() {
        if (head > -1) {
            int pop = data[head];
            head -= 1;
            return pop;
        } else {
            throw new StackOverflowError();
        }
    }

    public int peak() {
        if (head > -1) {
            return data[head];
        } else {
            throw new StackOverflowError();
        }
    }

    public void print() {
        for (int i = head; i > -1; i--) {
            System.out.println(data[i]);
        }
    }
}
