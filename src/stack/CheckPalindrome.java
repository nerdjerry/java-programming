package stack;

public class CheckPalindrome {

    public static boolean checkPalindrome(String input) {
        input = sanitize(input);
        int inputLength = input.length();
        StackArray stack = new StackArray(inputLength / 2);
        for (int i = 0; i < inputLength / 2; i++) {
            stack.push(input.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = inputLength / 2; i < inputLength; i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static String sanitize(String input) {
        input = input.toLowerCase();
        input = removePuntuation(input);
        return input;
    }

    public static String removePuntuation(String input) {
        String temporary = "";
        String puntuation = ",.?;:!/ ";
        for (int i = 0; i < input.length(); i++) {
            if (puntuation.indexOf((input.charAt(i))) == -1) {
                temporary += input.charAt(i);
            }
        }
        return temporary;
    }


    public static void main(String[] args) {
        System.out.println(checkPalindrome("I did, did I?"));
    }
}
