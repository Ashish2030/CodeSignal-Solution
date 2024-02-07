// The method iterates through each character in the string and uses the Character.isDigit() method to 
// check if the character is a digit. If a digit is found, it is returned. If no digit is found, it 
// returns the first character of the string.

public class Main {
    public static void main(String[] args) {
        String inputString = "abc123def456";
        char result = firstDigit(inputString);
        System.out.println("First digit: " + result);
    }
    
    public static char firstDigit(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char a = inputString.charAt(i);
            if (Character.isDigit(a)) {
                return a;
            }
        }
        return inputString.charAt(0);
    }
}
