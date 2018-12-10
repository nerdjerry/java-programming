package sort;

public class MergeSort {
    private int[] data;
    private int start;
    private int end;

    MergeSort(int[] input){
        data = input;
        start = 0;
        end = data.length;
    }

    public void sort(){
        mergesort(data,start,end);
    }

    private void mergesort(int[] data, int start, int end) {
        if(!(end-start < 2)) {
            int mid = (start + end) / 2;
            mergesort(data, start, mid);
            mergesort(data, mid, end);
            merge(data, start, mid, end);
        }
    }

    private void merge(int[] data, int start, int mid, int end) {
        /*
         Optimization 1: If last element of left subarray is less than
        equal to first element of right subarray then we need not do any comparison
        as left and right subarrays will already be sorted in themselves.
        So just merge two
         */

        if(data[mid-1] <= data[mid])
            return;

        int n = end - start;
        int[] temp = new int[n];
        int tindex = 0;
        int i = start;
        int j = mid ;

        while (i < mid  && j < end){
            temp[tindex++] = data[i] <= data[j] ? data[i++]: data[j++];
        }

        arrayCopy(data, data, i , start + tindex, mid - i);
        arrayCopy(temp, data, 0, start, tindex);
    }

    private void arrayCopy(int[] source, int[] dest, int sourceStart, int destStart, int count){
        int i = sourceStart;
        int j = destStart;

        while(count > 0){
            dest[j++] = source[i++];
            count--;
        }
    }

    public void print(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}
