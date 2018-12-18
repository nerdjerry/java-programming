package stack;

public class Main {

    public static void main(String[] args) {
        StackArray stackArray = new StackArray();
        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6);
        stackArray.push(12);
        stackArray.push(2);
        stackArray.push(8);
        stackArray.push(0);
        stackArray.push(9);
        stackArray.push(3);
        stackArray.push(7);
        stackArray.push(8);
        System.out.println(stackArray.peak());
        System.out.println(stackArray.pop());
        stackArray.print();
    }
}
