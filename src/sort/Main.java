package sort;

public class Main {
    public static void main(String[] args){
        int n = 10;
        int[] input = new int[n];
        for(int i = input.length - 1 ; i >= 0; i--){
            input[i] = n-1-i;
        }
        SelectionSort sorter = new SelectionSort(input);
        sorter.sort();

        for(int i = 0; i <input.length; i++){
            System.out.println(input[i]);
        }
    }
}
