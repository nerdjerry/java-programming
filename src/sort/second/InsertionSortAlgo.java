package sort.second;

public class InsertionSortAlgo {

    public static void sort(int[] input){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++){
            int newElement = input[firstUnsortedIndex];
            int i = firstUnsortedIndex;
            for(; i > 0 && input[i-1] > newElement;i--){
                input[i] = input[i-1];
            }
            input[i] = newElement;
        }
    }
}
