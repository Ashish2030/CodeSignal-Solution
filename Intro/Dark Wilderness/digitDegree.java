// This means that the digit degree of the number 12345 is 2, according to the logic in the digitDegree method. 
// The digit degree represents the number of times you need to sum the digits of a number until you get a single-digit
// result. In this case, 1 + 2 + 3 + 4 + 5 = 15, and then 1 + 5 = 6, which is a single digit.

public class Main {
    public static void main(String[] args) {
        int n = 12345;
        int result = digitDegree(n);
        System.out.println("Digit degree: " + result);
    }
    
    public static int digitDegree(int n) {
        int k = n;
        int sum = 0;
        int count = 0;
        
        while (String.valueOf(k).length() > 1) {
            int temp = k;
            sum = 0;
            count++;
            
            while (temp > 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            
            k = sum;
        }
        
        return count;
    }
}
