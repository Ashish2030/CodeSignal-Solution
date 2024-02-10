/*This means that the longest prefix consisting of digits from the input string "123abc456" is "123", 
according to the logic in the longestDigitsPrefix method. The method iterates through the characters 
of the input string and appends them to the result string r as long as they are digits. 
Once a non-digit character is encountered, the method returns the current value of r, 
which represents the longest digits prefix found.
The longestDigitsPrefix method initializes a variable to track the maximum length of the digits prefix, 
then iterates through the input string, appending digit characters to a result string until a non-digit character 
is encountered, and finally returns the result string representing the longest prefix of digits found.*/

public class Main {
    public static void main(String[] args) {
        // Define input value
        String inputString = "123abc456";
        
        // Call the longestDigitsPrefix method with the input value
        String result = longestDigitsPrefix(inputString);
        
        // Print the result
        System.out.println("Longest digits prefix: " + result);
    }
    
    public static String longestDigitsPrefix(String inputString) {
        // Initialize variables
        int max = Integer.MIN_VALUE; // Stores the maximum length of the prefix
        String r = ""; // Stores the longest digits prefix
        int flag = 0; // Indicates if any digit has been encountered or not
        
        // Iterate over each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            // Check if the current character is a digit
            if (Character.isDigit(inputString.charAt(i))) {
                // Append the digit to the prefix string
                r = r + String.valueOf(inputString.charAt(i));
                flag = 1; // Set the flag to indicate that a digit has been encountered
            } else {
                // If a non-digit character is encountered and a digit has been encountered before, return the current prefix
                if (flag == 1) {
                    return r;
                } else {
                    return r;
                }
            }
        }
        
        // Return the longest digits prefix
        return r;
    }
}
