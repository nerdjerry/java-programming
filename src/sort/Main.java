package sort;

public class Main {
    public static void main(String[] args){
        int[] input = new int[100];
        for(int i = input.length - 1 ; i > 0; i--){
            input[i] = i;
        }
        BubbleSort sorter = new BubbleSort(input);
        sorter.sort();

        for(int i = 0; i <input.length; i++){
            System.out.println(input[i]);
        }
    }
}
