package hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class HashtableJDK {
    public static void main(String[] args) {
        HashMap<String, Integer> table = new HashMap();
        table.put("Aditi", 12);
        table.put("Aditi2", 13);
        table.put("SOmya", 14);
        table.put("Sonal", 51);
        System.out.println(table.get("Aditi"));
        System.out.println(table.remove("SOmya"));
        System.out.print(table.getOrDefault("Prateek", 13));
        table.putIfAbsent("Aditi", 121);
        Iterator<Integer> iterator = table.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
