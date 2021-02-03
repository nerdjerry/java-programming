package sort;

public class MergeSortAlgo {

    public static void mergeSort(int[] input, int start, int end){
        if(start < end){
            int mid = (end+start)/2;
            mergeSort(input, start, mid);
            mergeSort(input, mid+1, end);
            merge(input, start, mid, end);
        }

    }

    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid] <= input[mid+1]){
            return;
        }
        int[] temp = new int[end-start+1];
        int j = 0;
        int lIndex = start;
        int rIndex = mid+1;

        while(lIndex < mid+1 && rIndex < end+1){
            temp[j++] = input[lIndex] <= input[rIndex] ? input[lIndex++] : input[rIndex++];
        }

        while(lIndex < mid+1){
            temp[j++] = input[lIndex++];
        }

        while(rIndex < end+1){
            temp[j++] = input[rIndex++];
        }

        while(j > 0){
            input[--rIndex] = temp[--j];
        }
    }
}
