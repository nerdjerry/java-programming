package stack;

public class StackArray {

    private int length = 10;
    private int[] data;
    private int head;

    StackArray() {
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
            System.out.println("Overflow");
            return -1;
        }
    }

    public int peak() {
        if (head > -1) {
            return data[head];
        } else {
            System.out.println("Overflow");
            return -1;
        }
    }

    public void print() {
        for (int i = head; i > -1; i--) {
            System.out.println(data[i]);
        }
    }
}
