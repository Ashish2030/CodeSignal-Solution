public class Main {
    public static int largestNumber(int n) {
        int x = (int) Math.pow(10, n);
        return x - 1;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 3;
        int result = largestNumber(n);
        System.out.println("Result: " + result);
    }
}
