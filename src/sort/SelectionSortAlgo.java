package sort;

import static sort.BubbleSortAlgo.swap;

public class SelectionSortAlgo {

    public static void sort(int[] array){
        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex >= 0; lastUnsortedIndex--){
            int largest = 0;
            for(int j=0; j<=lastUnsortedIndex; j++){
                if(array[j] > array[largest]){
                    largest = j;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
    }
}
