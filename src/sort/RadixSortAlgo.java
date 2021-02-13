package sort;

public class RadixSortAlgo {

    public static void sort(int array[], int width, int radix){
        int temp[] = new int[array.length];
        for(int i=0; i < width; i++){

            int count[] = new int[radix];

            //Count occurences
            for(int j = 0; j < array.length; j++){
                count[getDigit(array[j],i,radix)] += 1;
            }

            //Adjust counts
            for(int j = 1; j < radix; j++){
                count[j] += count[j-1];
            }

            //Store in temp
            for(int j = array.length-1; j > -1; j--){
                temp[count[getDigit(array[j], i, radix)] - 1] = array[j];
                count[getDigit(array[j], i, radix)] -= 1;
            }

            //Copy back to array
            for(int j=0; j<array.length; j++){
                array[j] = temp[j];
            }
        }
    }

    public static int getDigit(int number, int position, int radix){
        return (int) ((number/Math.pow(radix,position))%radix);
    }
}
