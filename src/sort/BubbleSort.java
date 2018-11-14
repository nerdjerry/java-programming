package sort;

public class BubbleSort {
    private int[] data;
    private int length;

    BubbleSort(int[] input){
        data = input;
        length = data.length;
    }

    public void sort(){
        for(int lastSortedIndex = length - 1 ; lastSortedIndex > 0 ; lastSortedIndex--){
            for(int i = 0 ; i < lastSortedIndex ; i++){
                if(data[i] > data[i+1])
                    swap(data,i);
            }
        }
    }

    private void swap(int[] array, int index) {
        array[index] = array[index] + array[index+1];
        array[index+1] = array[index] - array[index+1];
        array[index] = array[index] - array[index+1];

    }
}
