//This means that the longest prefix consisting of digits from the input string "123abc456" is "123", 
// according to the logic in the longestDigitsPrefix method. The method iterates through the characters 
// of the input string and appends them to the result string r as long as they are digits. 
// Once a non-digit character is encountered, the method returns the current value of r, 
// which represents the longest digits prefix found.

public class Main {
    public static void main(String[] args) {
        String inputString = "123abc456";
        String result = longestDigitsPrefix(inputString);
        System.out.println("Longest digits prefix: " + result);
    }
    
    public static String longestDigitsPrefix(String inputString) {
        int max = Integer.MIN_VALUE;
        String r = "";
        int flag = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                r = r + String.valueOf(inputString.charAt(i));
                flag = 1;
            } else {
                if (flag == 1) {
                    return r;
                } else {
                    return r;
                }
            }
        }
        
        return r;
    }
}
