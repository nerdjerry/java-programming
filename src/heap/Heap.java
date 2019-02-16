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
        heapifyAbove(index);
        index += 1;

    }

    private void heapifyAbove(int index) {
        int newValue = heap[index];
        int parentIndex = parent(index);
        while (index > 0 && newValue > heap[parentIndex]) {
            //Bring parent down
            heap[index] = heap[parentIndex];
            index = parentIndex;
            parentIndex = parent(index);
        }
        heap[index] = newValue;
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
