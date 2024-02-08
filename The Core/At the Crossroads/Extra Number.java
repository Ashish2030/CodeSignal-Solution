public class Main {
    public static int extraNumber(int a, int b, int c) {
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        // Example usage
        int a = 2;
        int b = 2;
        int c = 3;
        int result = extraNumber(a, b, c);
        System.out.println("Result: " + result);
    }
}
