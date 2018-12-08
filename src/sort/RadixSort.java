package sort;

public class RadixSort {
    int[] data;
    int radix;
    int width;
    int length;

    RadixSort(int[] input, int radix, int width){
        this.data = input;
        this.radix = radix;
        this.width = width;
        this.length = data.length;
    }

    private int getDigit(int number, int position, int radix){
        return number / (int)Math.pow(10,position) % radix;
    }

    public void sort(){
        int[] temp = new int[length];

        for(int i = 0; i < width; i++){
            int[] count = new int[radix];

            //Make all value in count array to 0
            for(int j = 0; j < count.length;j++){
                count[j] = 0;
            }

            //Count digits
            for(int j=0; j<length;j++){
                count[getDigit(data[j],i,radix)]+=1;
            }

            //Adjust counts
            for(int j = 1; j < count.length; j++){
                count[j] += count[j-1];
            }

            //Place elements at position in temp
            for(int j = length-1; j >=0 ; j--){
                temp[count[getDigit(data[j],i,radix)]-1] = data[j];
                count[getDigit(data[j],i,radix)]-=1;
            }

            //Copy elements back to OG array
            for(int j = 0; j < length ; j++){
                data[j] = temp[j];
            }
        }
    }

    public void print(){
        for(int i = 0; i < length; i++){
            System.out.println(data[i]);
        }
    }
}
