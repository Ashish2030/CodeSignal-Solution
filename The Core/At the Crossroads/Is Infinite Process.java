public class Main {
    public static boolean isInfiniteProcess(int a, int b) {
        if (b < a) {
            return true;
        }
        if ((b - a) % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int a = 2;
        int b = 5;
        boolean result = isInfiniteProcess(a, b);
        System.out.println("Result: " + result);
    }
}
