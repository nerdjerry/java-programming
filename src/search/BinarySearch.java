package search;

public class BinarySearch {

    public static int binarySearch(int[] input, int value) {
        return search(input, value, 0, input.length);
    }

    public static int search(int[] input, int value, int start, int end) {
        int midpoint = (start + end) / 2;
        if (start >= end) {
            return -1;
        } else {
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] > value) {
                return search(input, value, start, midpoint);
            } else {
                return search(input, value, midpoint + 1, end);
            }
        }
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {12, 34, 56, 67, 89, 90};
        System.out.println(iterativeBinarySearch(input, 56));
        System.out.println(iterativeBinarySearch(input, 45));
    }
}
