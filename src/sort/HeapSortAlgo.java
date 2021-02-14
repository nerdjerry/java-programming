package sort;

public class HeapSortAlgo {

    public static void sort(int[] heap){
        int index = heap.length - 1;
        while(index > -1) {
            int tmp = heap[index];
            heap[index] = heap[0];
            heap[0] = tmp;
            heapifyBelow(heap, 0, index);
            index--;
        }
    }

    public static void heapifyBelow(int[] heap, int index, int lastHeapIndex){
        int leftChildIndex = leftChild(index);
        int rightChildIndex = rightChild(index);
        int childToSwap;
        while(index < lastHeapIndex){
            if(leftChildIndex < lastHeapIndex){
                if(rightChildIndex < lastHeapIndex && heap[leftChildIndex] < heap[rightChildIndex]){
                    childToSwap = rightChildIndex;
                }else{
                    childToSwap = leftChildIndex;
                }
            }else{
                break;
            }
            if(heap[childToSwap] > heap[index]){
                int temp = heap[childToSwap];
                heap[childToSwap] = heap[index];
                heap[index] = temp;
                index = childToSwap;
            }else{
                break;
            }
        }
    }

    public static int leftChild(int index){
        return 2 * index + 1;
    }

    public static int rightChild(int index){
        return 2 * index + 2;
    }
}
