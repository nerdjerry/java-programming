package heap;

public class Heap {

    private int[] heap;
    private int index;

    Heap() {
        heap = new int[100];
        index = 0;
    }

    public void insert(int value) {
        heap[index] = value;
        index += 1;
        int currentIndex = index - 1;
        int parentIndex = parent(currentIndex);
        while (parentIndex >= 0 && heap[currentIndex] > heap[parentIndex]) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = parent(currentIndex);
        }
    }

    private void swap(int currentIndex, int parentIndex) {
        int temp = heap[parentIndex];
        heap[parentIndex] = heap[currentIndex];
        heap[currentIndex] = temp;
    }

    private int parent(int currentIndex) {
        return (int) Math.floor((currentIndex - 1) / 2);

    }
}
