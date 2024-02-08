public class Main {
    public static int lateRide(int n) {
        int k = n % 60; //gives the last digit
        int y = n / 60; //discards the last digit
        int sum = 0;
        while (y > 0) {
            sum = sum + y % 10;
            y = y / 10;
        }
        while (k > 0) {
            sum = sum + k % 10;
            k = k / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 135;
        int result = lateRide(n);
        System.out.println("Result: " + result);
    }
}
