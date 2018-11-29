package sort;

public class MergeSort {
    private int[] data;
    private int start;
    private int end;

    MergeSort(int[] input){
        data = input;
        start = 0;
        end = data.length - 1;
    }

    public void sort(){
        mergesort(data,start,end);
    }

    private void mergesort(int[] data, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergesort(data, start, mid);
            mergesort(data, mid+1, end);
            merge(data, start, mid, end);
        }
    }

    private void merge(int[] data, int start, int mid, int end) {
        int n = end - start + 1;
        int[] temp = new int[n];
        int tindex = 0;
        int i = start;
        int j = mid + 1;

        while(i < mid + 1 || j <  end + 1){
            if(i == mid + 1){
                temp[tindex++] = data[j++];
            } else if(j == end + 1){
                temp[tindex++] = data[i++];
            } else{
                if(data[i] < data [j]){
                    temp[tindex++] = data[i++];
                } else{
                    temp[tindex++] = data[j++];
                }
            }
        }

        //Copy sorted elements to original array
        int aindex = end;
        tindex--;
        while (aindex >= start){
            data[aindex--] = temp[tindex--];
        }
    }

    public void print(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}
