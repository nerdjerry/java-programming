package sort;

public class Main {
    public static void main(String[] args){
        int n = 100;
        int[] input = new int[n];
        for(int i = input.length - 1 ; i >= 0; i--){
            input[i] = n-1-i;
        }

        String[] data = new String[]{"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        RadixSort sorter = new RadixSort(data, 26, 5);
        sorter.sortAlpha();

        sorter.print();
    }
}
