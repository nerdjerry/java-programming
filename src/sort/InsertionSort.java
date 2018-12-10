package sort;

public class InsertionSort {
    private int[] data;
    private  int length;

    InsertionSort(int[] input){
        data = input;
        length = data.length;
    }

    public void sort(){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < length; firstUnsortedIndex++){
            int newElement = data[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && data[i-1] > newElement; i--){
                    data[i] = data[i-1];
            }
            data[i] = newElement;
        }
    }

    public void recurssionSort(){
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < length; firstUnsortedIndex++){
            int newElement = data[firstUnsortedIndex];
            shift(data, newElement, firstUnsortedIndex);
        }
    }

    private void shift(int[] data, int newElement, int i) {
        if(!(i > 0 && data[i-1]>newElement)){
            return;
        }

        data[i] = data[i-1];
        data[i-1] = newElement;
        shift(data, newElement, i-1);
    }

    public void print(){
        for(int i=0; i < length; i++){
            System.out.println(data[i]);
        }
    }
}
