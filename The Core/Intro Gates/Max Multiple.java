class Main {
    public static void main(String[] args) {
        int divisor = 3;
        int bound = 10;
        int result = maxMultiple(divisor, bound);
        System.out.println("Result: " + result);
    }

    static int maxMultiple(int divisor, int bound) {
        double a = (double) bound;
        int b = (int) Math.floor(a / divisor);
        return b * divisor;
    }
}
