public class Main {
    public static int addTwoDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 123;
        int result = addTwoDigits(n);
        System.out.println("Result: " + result);
    }
}
