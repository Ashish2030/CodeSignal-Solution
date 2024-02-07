/*The palindromeRearranging method determines whether a given string can be rearranged to form a 
palindrome. It counts the occurrences of each character in the string using an integer array. 
If there is more than one character with an odd count, the method returns false, indicating that 
the string cannot be rearranged into a palindrome; otherwise, it returns true.*/

import java.util.Arrays;

public class PalindromeRearranging {
    public static boolean palindromeRearranging(String str) {
        int[] a = new int[256];
        Arrays.fill(a, 0);
        
        for (int i = 0; i < str.length(); i++) {
            a[(int) str.charAt(i)]++;
        }
        
        int c = 0;
        for (int i = 0; i < 256; i++) {
            if ((a[i] & 1) == 1) {
                c++;
            }
        }
        
        if (c > 1) {
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String input = "aabd";
        boolean result = palindromeRearranging(input);
        System.out.println("Can rearrange to form a palindrome: " + result);
    }
}
     
