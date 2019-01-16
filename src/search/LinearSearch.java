package search;

public class LinearSearch {

    public static int search(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = {34, 65, 12, 34, 76, -90, 12};
        System.out.println(search(input, 45));
        System.out.println(search(input, 12));
    }
}
