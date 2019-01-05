package hashtable;

public class Main {

    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("Prateek", 23);
        table.put("Aditi", 12);
        table.put("Aditi6", 67);
        table.put("Aditi77", 78);
        table.put("Somya", 12);
        table.put("Sonal", 89);
        System.out.println(table.get("Aditi"));
        table.remove("Aditi");
        table.remove("Aditi6");
        System.out.println("Stop");
    }
}
 