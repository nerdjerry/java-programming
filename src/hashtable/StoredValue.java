package hashtable;

public class StoredValue<T> {

    private String key;
    private T value;

    StoredValue(String key, T value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

}
