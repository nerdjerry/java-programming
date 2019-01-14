package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BucketSort {

    public static void bubbleSort(int[] input) {
        List<Integer>[] table = new ArrayList[10];

        //Step1 : put items in bucket using hashing function
        for (int i = 0; i < input.length; i++) {
            int hashedValue = hash(input[i]);
            if (table[hashedValue] == null) {
                table[hashedValue] = new ArrayList<>();
            }
            table[hashedValue].add(input[i]);
        }

        //Step 2 : Sort elements in each bucket
        for (int i = 0; i < 10; i++) {
            if (table[i] != null) {
                table[i].sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });
            }
        }
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (table[i] != null) {
                Iterator<Integer> iterator = table[i].iterator();
                while (iterator.hasNext()) {
                    input[j] = iterator.next();
                    j += 1;
                }
            }
        }
    }

    private static int hash(int value) {
        return Math.abs(value / 10);
    }

    public static void main(String[] args) {
        int[] input = {54, 46, 83, 66, 95, 92, 43};
        bubbleSort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
