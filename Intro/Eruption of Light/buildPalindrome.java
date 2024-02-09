/* the buildPalindrome method is called with the input string "abc". It checks all possible prefixes of
the input string with the reversed string "cba" until it finds a palindrome, which is "abcba". 
The method returns this palindrome as the output. */

public class PalindromeBuilder {
    public static void main(String[] args) {
        String input = "abcd";
        String palindrome = buildPalindrome(input);
        System.out.println(palindrome); // Output: "abcdcba"
    }

    public static String buildPalindrome(String st) {
        String str = new StringBuffer(st).reverse().toString();
        for (int i = 0; i < st.length(); i++) {
            if ((st.substring(0, i) + str).equals(new StringBuffer(st.substring(0, i) + str).reverse().toString())) {
                return (st.substring(0, i) + str);
            }
        }
        return "a";
    }
}
