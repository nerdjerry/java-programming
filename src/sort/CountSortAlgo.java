package sort;

public class CountSortAlgo {

    public static void sort(int[] array, int min, int max){
        int length = max-min+1;
        int[] countArray = new int[length];

        for(int i=0; i < length; i++){
            countArray[i] = 0;
        }

        for(int i = 0; i<array.length; i++){
            countArray[array[i]-min]++;
        }

        for(int i=1; i<length; i++){
            countArray[i] += countArray[i-1];
        }
        int[] temp = new int[array.length];
        for(int i=array.length-1;i > -1; i--){
            temp[countArray[array[i] - min]-1] = array[i];
            countArray[array[i]-min]--;
        }
        for(int i=0; i<array.length;i++){
            array[i] = temp[i];
        }
    }
}
