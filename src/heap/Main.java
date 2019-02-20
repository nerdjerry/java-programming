package heap;

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(56);
        heap.insert(23);
        heap.insert(45);
        heap.insert(4);
        heap.insert(12);
        heap.insert(90);
        heap.insert(123);
        heap.insert(214);
        heap.insert(81);
        heap.insert(91);
        heap.remove(1);
    }
}
