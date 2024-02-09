public class Main {
    public static boolean arithmeticExpression(int a, int b, int c) {
        double a1 = a;
        float p = (float) (a1 / b);
        System.out.println(p);

        if (a + b == c) {
            return true;
        } else if (a - b == c) {
            return true;
        } else if (a * b == c) {
            return true;
        } else if (p == c) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int a = 5;
        int b = 2;
        int c = 7;
        boolean result = arithmeticExpression(a, b, c);
        System.out.println("Result: " + result);
    }
}
