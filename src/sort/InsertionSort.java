package sort;

public class InsertionSort {
    private int[] data;
    private  int length;

    InsertionSort(int[] input){
        data = input;
        length = data.length;
    }

    public void sort(){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < length; firstUnsortedIndex++){
            int newElement = data[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && data[i-1] > newElement; i--){
                    data[i] = data[i-1];
            }
            data[i] = newElement;
        }
    }
}
