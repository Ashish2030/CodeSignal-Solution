/*The longestWord method takes a text string as input and splits it into individual words using 
non-alphabetic characters as delimiters. It then finds the longest word by applying the max operation 
on the stream of words and comparing their lengths. The method returns the longest word as a result.*/

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, this is a sample text.";
        String longest = longestWord(text);
        System.out.println("Longest word: " + longest);
    }
    
    static String longestWord(String text) {
        return Arrays.stream(text.split("\\P{Alpha}+"))
                .max(Comparator.comparing(String::length))
                .get();
    }
}
