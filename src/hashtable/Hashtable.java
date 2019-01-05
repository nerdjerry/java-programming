package hashtable;

public class Hashtable {

    private StoredValue<Integer>[] table;
    private int capacity;

    Hashtable() {
        capacity = 20;
        table = new StoredValue[capacity];
    }

    public void put(String key, int value) {
        int hashedKey = hash(key);
        if (!occupied(hashedKey)) {
            table[hashedKey] = new StoredValue<Integer>(key, value);
        } else {
            //Linear probing to insert value
            int initialKey = hashedKey;
            hashedKey = (hashedKey + 1) % capacity;
            while (occupied(hashedKey) && hashedKey != initialKey) {
                hashedKey = (hashedKey + 1) % capacity;
            }
            if (hashedKey != initialKey) {
                table[hashedKey] = new StoredValue<Integer>(key, value);
            } else {
                //Can resize here
                System.out.println("Collision occured and no space can't insert");
            }
        }
    }

    public int get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return -1;
        }
        return table[hashedKey].getValue();
    }

    public void remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return;
        }
        table[hashedKey] = null;
        StoredValue<Integer>[] oldTable = table;
        table = new StoredValue[capacity];
        for (int i = 0; i < capacity; i++) {
            if (oldTable[i] != null) {
                put(oldTable[i].getKey(), oldTable[i].getValue());
            }
        }
    }
    private int hash(String key) {
        return key.length() % 20;
    }

    private boolean occupied(int hashKey) {
        return table[hashKey] != null;
    }

    private int findKey(String key) {
        int hashedKey = hash(key);
        if (occupied(hashedKey) && table[hashedKey].getKey() == key) {
            return hashedKey;
        }
        //Look for key linear probing
        int initialKey = hashedKey;
        hashedKey = (hashedKey + 1) % capacity;
        while (occupied(hashedKey) && table[hashedKey].getKey() != key &&
                hashedKey != initialKey) {
            hashedKey = (hashedKey + 1) % capacity;
        }
        if (occupied(hashedKey) && table[hashedKey].getKey() == key) {
            return hashedKey;
        } else {
            return -1;
        }
    }
}
