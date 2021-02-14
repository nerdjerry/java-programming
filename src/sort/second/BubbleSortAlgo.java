package sort.second;

public class BubbleSortAlgo {
    public static void sort(int[] array){
        for(int i=0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] array, int j, int k){
        int temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
    }
}
