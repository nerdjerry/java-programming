package linkedlist.jdk;

import java.util.LinkedList;

public class LinkedListSorted {

    private LinkedList<Integer> list;

    LinkedListSorted() {
        list = new LinkedList<>();
    }

    public void insertSorted(int value) {
        if (list.isEmpty()) {
            list.add(value);
            return;
        }
        int index = 0;
        while (index < list.size() && list.get(index) < value) {
            index++;
        }
        if (index < list.size()) {
            list.add(index, value);
        } else {
            list.addLast(value);
        }
    }

    public void print() {
        System.out.print(list);
    }
}
