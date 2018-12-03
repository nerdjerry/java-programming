package sort;

public class QuickSort {
    private int[] data;
    private int start;
    private int end;
    private int length;

    QuickSort(int[] input){
        data = input;
        start = 0;
        end = data.length;
        length = data.length;
    }

    public void sort(){
        quicksort(data, start, end);
    }

    private void quicksort(int[] data, int start, int end) {
        if(start < end){
            int position = partition(data, start, end);
            quicksort(data,start,position);
            quicksort(data,position+1, end);
        }
    }

    private int partition(int[] data, int start, int end){
        int i = start;
        int j = end;
        int pivot = data[start];
        while(i < j){
            while (data[--j] > pivot && i < j);
            if (i < j) {
                data[i] = data[j];
            }
            while(data[++i] <= pivot && i < j);
            if (i < j) {
                data[j] = data[i];
            }
        }
        data[i] = pivot;
        return i;
    }

    public void print(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}
