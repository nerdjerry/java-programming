import queue.QueueArray;
import stack.StackArray;

public class Palindrome {

    //Check palindrome using stacks and queues
    public static boolean isPalindrome(String input) {
        input = santise(input);
        int inputLength = input.length();
        QueueArray<Character> queue = new QueueArray<>(inputLength);
        StackArray stackArray = new StackArray(inputLength);
        for (int i = 0; i < inputLength; i++) {
            queue.enqueue(input.charAt(i));
            stackArray.push(input.charAt(i));
        }
        int i = 0;
        while (i < inputLength) {
            if (queue.dequeue() != stackArray.pop()) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static String santise(String input) {
        input = input.toLowerCase();
        input = removePuntuation(input);
        return input;
    }

    private static String removePuntuation(String string) {
        String temp = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                temp += string.charAt(i);
            }
        }
        return temp;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome("I did, did I?"));
    }
}
