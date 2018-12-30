package hashtable;

public class Main {

    public static void main(String[] args) {
        hashtable<Integer> table = new hashtable<Integer>();
        table.put("Prateek", 23);
        table.put("Aditi", 12);
        table.put("Somya", 12);
        System.out.println(table.get("Aditi"));
    }
}
