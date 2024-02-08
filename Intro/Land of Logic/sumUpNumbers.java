/*The sumUpNumbers function takes an input string and calculates the sum of all the numbers present in the string.
It iterates through each character of the string and checks if it is a digit. If it is, it adds it to a temporary 
string r to form a number. When a non-digit character is encountered, it adds the number represented by r to the
total sum and resets r. Finally, it returns the sum of all the numbers found in the input string*/

public class Main {
    public static void main(String[] args) {
        String inputString = "abc123def456ghi";
        int result = sumUpNumbers(inputString);
        System.out.println("Sum of numbers in the input string: " + result);
    }

    static int sumUpNumbers(String inputString) {
        char[] a = inputString.toCharArray();
        int flag = 0;
        String r = "";
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                r = r + String.valueOf(a[i]);
                flag = 1;
            } else {
                if (flag == 1) {
                    sum = sum + Integer.valueOf(r);
                    r = "";
                    flag = 0;
                }
            }
        }

        if (!r.isEmpty()) {
            sum = sum + Integer.valueOf(r);
        }

        return sum;
    }
}
