package sort;

public class ShellSortAlgo {

    public static void sort(int[] input){
        for(int gap = input.length/2; gap > 0; gap = gap/2){
            for(int i = gap; i < input.length; i++){
                int newElement = input[i];
                int j = i;
                for(;j >= gap && input[j-gap] > newElement; j = j-gap){
                    input[j] = input[j-gap];
                }
                input[j] = newElement;
            }
        }
    }
}
