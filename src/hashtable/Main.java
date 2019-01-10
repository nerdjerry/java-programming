package hashtable;

public class Main {

    public static void main(String[] args) {
        HashtableChain table = new HashtableChain(20);
        table.put("Prateek", 23);
        table.put("Aditi", 12);
        table.put("Aditi6", 67);
        table.put("Aditi77", 78);
        table.put("Somya", 12);
        table.put("Sonal", 89);
        table.printTable();
        System.out.println(table.get("Aditi"));
        table.remove("Aditi");
        table.remove("Aditi6");
        table.printTable();
    }
}
 