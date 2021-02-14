package sort.second;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BucketSortAlgo {

    public static void sort(int[] array){
        List<Integer>[] hash = new ArrayList[10];

        for(int i=0; i< hash.length; i++){
            hash[i] = new ArrayList<>();
        }

        //Step 1: Scattering into buckets
        for(int i=0; i<array.length; i++){
            int hashValue = hash(array[i]);
            hash[hashValue].add(array[i]);
        }

        //Step2 : Sorting
        for(int i = 0; i < hash.length; i++){
            if(!hash[i].isEmpty()){
                hash[i].sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });
            }
        }

        //Step 3: Gathering
        int j = 0;
        for(int i=0; i < hash.length; i++){
            if(!hash[i].isEmpty()){
                Iterator<Integer> iterator = hash[i].iterator();
                while(iterator.hasNext()){
                    array[j++] = iterator.next();
                }
            }
        }
    }

    public static int hash(int value){
        return (int) Math.floor(value/100);
    }
}
