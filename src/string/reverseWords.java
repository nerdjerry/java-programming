package string;
import java.util.*;

public class reverseWords {
    public static String reverseString(String S){
        String[] words = S.split(".",0);
        LinkedList<String> stack = new LinkedList<String>();
        StringBuilder output = new StringBuilder();
        for(String word : words){
            stack.push(word);
        }
        while(!stack.isEmpty()){
            output.append(stack.pop()).append(".");
        }
        output.setLength(output.length()-1);
        return output.toString();
    }
    
    public static void main(String[] args){
        System.out.println(reverseString("i.like.this.program.very.much"));
    }
}
