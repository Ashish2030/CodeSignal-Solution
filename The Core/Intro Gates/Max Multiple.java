/*The maxMultiple function calculates the largest multiple of divisor that is less than or equal to bound.
It achieves this by performing floating-point division using bound casted to a double, rounding down the result to the nearest integer using Math.floor.
The function returns the product of the rounded-down value and divisor, representing the maximum multiple satisfying the given conditions.*/

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
