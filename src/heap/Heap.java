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
                heapifyBelow(deleteIndex, this.index);
            } else {
                return;
            }
        }
    }

    public int remove(int index) {
        if (isEmpty()) {
            return -1;
        }
        int deletedValue = heap[index];
        int parentIndex = parent(index);
        heap[index] = heap[this.index - 1];
        heap[this.index - 1] = 0;
        if (index == 0 || heap[index] < heap[parentIndex]) {
            heapifyBelow(index, this.index - 1);
        } else {
            heapifyAbove(index);
        }
        this.index -= 1;
        return deletedValue;
    }

    public int peak() {
        if (isEmpty()) {
            return -1;
        } else {
            return heap[0];
        }
    }

    public void heapsort() {
        int lastHeapIndex = this.index - 1;
        while (lastHeapIndex >= 0) {
            int tmp = this.heap[0];
            this.heap[0] = this.heap[lastHeapIndex];
            this.heap[lastHeapIndex] = tmp;
            heapifyBelow(0, lastHeapIndex);
            lastHeapIndex -= 1;
        }
    }

    private void heapifyBelow(int index, int lastHeapIndex) {
        int childToSwap;
        while (index < lastHeapIndex) {
            int leftChildIndex = leftChild(index);
            int rightChildIndex = rightChild(index);
            if (leftChildIndex < lastHeapIndex) {
                if (rightChildIndex < lastHeapIndex && heap[leftChildIndex] < heap[rightChildIndex]) {
                    childToSwap = rightChildIndex;
                } else {
                    childToSwap = leftChildIndex;
                }
            } else {
                break;
            }
            if (heap[index] < heap[childToSwap]) {
                int tmp = heap[index];
                heap[index] = heap[childToSwap];
                heap[childToSwap] = tmp;
            } else {
                break;
            }
            index = childToSwap;
        }
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

    public boolean isEmpty() {
        return index == 0;
    }

    public void printSorted() {
        int currentIndex = this.index - 1;
        while (currentIndex >= 0) {
            System.out.print(heap[currentIndex]);
            System.out.print(",");
            currentIndex -= 1;
        }
        System.out.println();
    }
}
