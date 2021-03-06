package sort;

public class CountSort {
    private int[] data;
    private int upper;
    private int lower;
    private int length;

    CountSort(int[] input, int upper,int lower){
        data = input;
        this.upper = upper;
        this.lower = lower;
        length = data.length;
    }

    public void sort(){
        int countLength = upper - lower+2;
        int[] count = new int[countLength];

        for(int i = 0 ; i < countLength; i++){
            count[i] = 0;
        }
        count[0] = -1;
        for(int i = 0; i < length; i ++){
            count[data[i]]++;
        }

        for(int i = 0, j = 0; i < countLength; i++){
            if(count[i] == -1){
                continue;
            }
            while (count[i] > 0){
                data[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public void print(){
        for(int i = 0; i < length; i++){
            System.out.println(data[i]);
        }
    }

    public void stableSort(){
        int countLength = upper - lower + 1;
        int[] count = new int[countLength];

        for(int i = 0 ; i < countLength; i++){
            count[i] = 0;
        }

        for(int i = 0; i < length;i++){
            count[data[i]-lower] +=1;
        }

        for(int i = 1; i < countLength; i++){
            count[i] += count[i-1];
        }

        int[] temp = new int[length];
        for(int i=length-1; i >= 0;i--){
            temp[count[data[i]-lower]-1] = data[i];
            count[data[i]-lower]-=1;
        }

        for(int i =0;i<length;i++){
            data[i] = temp[i];
        }
    }
}
