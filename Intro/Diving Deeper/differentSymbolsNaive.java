// This means that the input string "abracadabra" contains 5 different symbols, according to the logic in the 
// differentSymbolsNaive method. The method uses a HashSet to store unique characters encountered while iterating 
// through the string. After the loop ends, the size of the HashSet is returned, which represents the count of different symbols in the string.

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "abracadabra";
        int result = differentSymbolsNaive(s);
        System.out.println("Number of different symbols: " + result);
    }
    
    public static int differentSymbolsNaive(String s) {
        Set<Character> a = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            a.add(s.charAt(i));
        }
        
        return a.size();
    }
}
