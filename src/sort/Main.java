package sort;

public class Main {
    public static void main(String[] args){
        int n = 10;
        int[] input = new int[n];
        for(int i = input.length - 1 ; i >= 0; i--){
            input[i] = n-1-i;
        }

        String[] data = new String[]{"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        RadixSort sorter = new RadixSort(data, 26, 5);
        int[] array = {20,35,15,7,35,1,22,16,21};
        CountSortAlgo.sort(array,1,35);

        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + ",");
        }
        //sorter.print();
    }
}
