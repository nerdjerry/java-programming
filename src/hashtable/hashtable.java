package hashtable;

public class hashtable<T> {

    private T[] table;

    hashtable() {
        table = (T[]) new Object[20];
    }

    public void put(String key, T value) {
        int hashedKey = hash(key);
        if (table[hashedKey] != null) {
            System.out.println("Can't insert at this location, Collision has occured");
        }
        table[hashedKey] = value;
    }

    public T get(String key) {
        return table[hash(key)];
    }

    private int hash(String key) {
        return key.length() % 20;
    }
}
