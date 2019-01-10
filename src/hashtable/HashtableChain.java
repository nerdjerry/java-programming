package hashtable;


import java.util.Iterator;
import java.util.LinkedList;

public class HashtableChain {

    private LinkedList<StoredValue<Integer>>[] table;
    private int capacity;

    HashtableChain(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[this.capacity];
    }

    public void put(String key, int value) {
        int hashedKey = hash(key);
        if (table[hashedKey] == null) {
            table[hashedKey] = new LinkedList<>();
        }
        this.table[hashedKey].add(new StoredValue<>(key, value));
    }

    public int get(String key) {
        int hashedKey = hash(key);
        Iterator<StoredValue<Integer>> iterator = table[hashedKey].iterator();
        StoredValue<Integer> current;
        while (iterator.hasNext()) {
            current = iterator.next();
            if (current.getKey() == key) {
                return current.getValue();
            }
        }
        return -1;
    }

    public int remove(String key) {
        int hashedKey = hash(key);
        int index = 0;
        int removedValue = -1;
        if (table[hashedKey] == null) {
            return removedValue;
        }
        StoredValue<Integer> current;
        Iterator<StoredValue<Integer>> iterator = table[hashedKey].iterator();
        while (iterator.hasNext()) {
            current = iterator.next();
            if (current.getKey() == key) {
                removedValue = current.getValue();
                table[hashedKey].remove(index);
                break;
            }
            index += 1;
        }
        return removedValue;
    }

    public int hash(String key) {
        return Math.abs(key.length()) % this.capacity;
    }

    public void printTable() {
        StoredValue<Integer> current;
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null && table[i].size() != 0) {
                Iterator<StoredValue<Integer>> iterator = table[i].iterator();
                while (iterator.hasNext()) {
                    current = iterator.next();
                    System.out.print("Key: " + current.getKey() + ", Value : " + current.getValue());
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }
}
