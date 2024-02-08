public class Main {
    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int val = 0;
        int flag = 0;

        if (value1 >= value2 && maxW >= weight1) {
            val += value1;
            maxW -= weight1;
            flag = 1;
        }

        if (value2 >= value1 && maxW >= weight2) {
            val += value2;
            maxW -= weight2;
            flag = 2;
        }

        if (maxW >= weight2 && flag != 2) {
            val += value2;
        }

        if (maxW >= weight1 && flag != 1) {
            val += value1;
        }

        return val;
    }

    public static void main(String[] args) {
        // Example usage
        int value1 = 10;
        int weight1 = 5;
        int value2 = 7;
        int weight2 = 4;
        int maxW = 8;
        int result = knapsackLight(value1, weight1, value2, weight2, maxW);
        System.out.println("Result: " + result);
    }
}
