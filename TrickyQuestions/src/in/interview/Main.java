package in.interview;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sentence = "             I    Love   My   India          ";
        
        // Split on one or more spaces using regex
        String[] words = sentence.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        // Print the words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
