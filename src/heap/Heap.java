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

    public void delete(int value) {
        int deleteIndex = getDeleteIndex(value);
        if (deleteIndex == -1) {
            //Value to be deleted not found
            return;
        } else {
            this.index -= 1;
            heap[deleteIndex] = heap[this.index];
            heap[this.index] = 0;
            if (deleteIndex > 0 && heap[deleteIndex] > heap[parent(deleteIndex)]) {
                heapifyAbove(deleteIndex);
            } else if ((leftChildExists(deleteIndex) && heap[deleteIndex] < heap[leftChild(deleteIndex)])
                    || (rightChildExists(deleteIndex) && heap[deleteIndex] < heap[rightChild(deleteIndex)])) {
                heapifyBelow(deleteIndex);
            } else {
                return;
            }
        }
    }

    private void heapifyBelow(int index) {
        int value = heap[index];
        int leftChildIndex = leftChild(index);
        int rightChildIndex = rightChild(index);
        while ((leftChildExists(index) && value < heap[leftChild(index)])
                || (rightChildExists(index) && value < heap[rightChild(index)])) {
            if (heap[leftChildIndex] > heap[rightChildIndex]) {
                heap[index] = heap[leftChildIndex];
                index = leftChildIndex;
                leftChildIndex = leftChild(index);
                rightChildIndex = rightChild(index);
            } else {
                heap[index] = heap[rightChildIndex];
                index = rightChildIndex;
                leftChildIndex = leftChild(index);
                rightChildIndex = rightChild(index);
            }
        }
        heap[index] = value;
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

    private boolean leftChildExists(int index) {
        return leftChild(index) < this.index && heap[leftChild(index)] != 0;
    }

    private boolean rightChildExists(int index) {
        return rightChild(index) < this.index && heap[rightChild(index)] != 0;
    }

    private int getDeleteIndex(int value) {
        int currentIndex = 0;
        while (currentIndex < this.index) {
            if (heap[currentIndex] == value) {
                return currentIndex;
            }
            currentIndex += 1;
        }
        return -1;
    }

    private int parent(int currentIndex) {
        return (int) Math.floor((currentIndex - 1) / 2);

    }

    private int leftChild(int currentIndex) {
        return 2 * currentIndex + 1;
    }

    private int rightChild(int currentIndex) {
        return 2 * currentIndex + 2;
    }
}
