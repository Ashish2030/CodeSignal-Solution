/*The circleOfNumbers function takes two integers, n and firstNumber, representing the total number of numbers in a 
circle and the starting number, respectively. It iterates through the circle, incrementing the count until reaching the
midpoint. If the starting number is equal to n - 1, it prints the count and sets the starting number to 0; otherwise, 
it increments the starting number. Finally, it returns the updated starting number.*/

public class Main {
    public static int circleOfNumbers(int n, int firstNumber) {
        int count = n / 2;
        int count1 = 0;
        while (true) {
            if (count1 == count) {
                break;
            }
            count1++;
            if (firstNumber == n - 1) {
                System.out.println(count1);
                firstNumber = 0;
            } else {
                firstNumber++;
            }
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 10;
        int firstNumber = 7;
        int result = circleOfNumbers(n, firstNumber);
        System.out.println("Result: " + result);
    }
}
