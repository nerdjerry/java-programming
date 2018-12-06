package sort;

public class Main {
    public static void main(String[] args){
        int n = 100;
        int[] input = new int[n];
        for(int i = input.length - 1 ; i >= 0; i--){
            input[i] = n-1-i;
        }

        input = new int[]{20, 35, 15, 7, 55, 1, 20,16,29};
        CountSort sorter = new CountSort(input, 55, 1);
        sorter.sort();

        sorter.print();
    }
}
