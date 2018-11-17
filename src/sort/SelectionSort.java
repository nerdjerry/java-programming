package sort;

public class SelectionSort {
    private int[] data;
    private int length;

    SelectionSort(int[] input){
        data = input;
        length = data.length;
    }

    public void sort(){

        for(int lastSortedIndex = length - 1 ; lastSortedIndex > 0 ; lastSortedIndex--){
            int largestElementIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++){
                if(data[i] > data[largestElementIndex]){
                    largestElementIndex = i;
                }
            }
            swap(largestElementIndex,lastSortedIndex);
        }
    }

    private void swap( int index, int largest){
        if (index == largest){
            return;
        }
        int temp = data[index];
        data[index] = data[largest];
        data[largest] = temp;
    }
}
