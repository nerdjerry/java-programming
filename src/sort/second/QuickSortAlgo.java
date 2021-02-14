package sort.second;

public class QuickSortAlgo {

    public static void sort(int[] array, int start, int end){
        if(start < end){
            int position = partition(array, start, end);
            sort(array,start, position);
            sort(array,position+1, end);
        }
    }

    public static int partition(int[] array, int start, int end){
        int left = start;
        int right = end-1;
        int pivot = array[left];

        while(left < right){
            while(array[right] > pivot && left < right){
                right--;
            }

            if(left < right){
                array[left] = array[right];
                left++;
            }

            while(array[left] < pivot && left < right){
                left++;
            }

            if(left < right){
                array[right] = array[left];
                right--;
            }
        }
        array[right] = pivot;
        return right;
    }
}
