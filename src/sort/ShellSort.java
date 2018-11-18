package sort;

public class ShellSort {
    private int[] data;
    private int length;

    ShellSort(int[] input){
        data = input;
        length = data.length;
    }

    public void sort(){
        for (int gap = length/2 ; gap > 0 ; gap = gap/2){
            for(int i = gap; i < length ; i++){
                int newElement = data[i];
                int j;
                for(j = i; j > 0 && data[j-gap] > newElement; j = j-gap){
                    data[j] = data[j-gap];
                }
                data[j] = newElement;
            }
        }
    }
}
