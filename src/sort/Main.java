package sort;

public class Main {
    public static void main(String[] args){
        int n = 100;
        int[] input = new int[n];
        for(int i = input.length - 1 ; i >= 0; i--){
            input[i] = n-1-i;
        }

        input = new int[]{2,9,2,4,2,6,5,9,3};
        CountSort sorter = new CountSort(input,9,2);
        sorter.stableSort();

        sorter.print();
    }
}
