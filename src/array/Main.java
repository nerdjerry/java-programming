package array;

public class Main {

    public static void main(String[] args){
        Array array = new Array();
        array.insertAtEnd(4);
        array.insertAtEnd(5);
        array.insertAt(6,19);
        array.insertAtEnd(9);
        array.print();
        array.delete(9);
        array.deleteAt(19);
        array.insertAt(8,20);
        array.insertAt(9,21);
        array.insertAt(91,22);
        array.insertAt(81,39);
        array.deleteByShift(8);
    }
}
