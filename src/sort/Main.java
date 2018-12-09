package sort;

public class Main {
    public static void main(String[] args){
        int n = 100;
        int[] input = new int[n];
        for(int i = input.length - 1 ; i >= 0; i--){
            input[i] = n-1-i;
        }

            input = new int[]{1236,3213,1113,5674,4321,6543,7658};
        MergeSort sorter = new MergeSort(input);
        sorter.sort();

        sorter.print();
    }
}
