//  5 + 4 = 9, which is greater than 7
//  value1 = 10 is greater than value2 = 8.
// checks if the weight of Item 1 (weight1 = 5) is less than or equal to the maximum weight limit (maxW = 7). 
// Since 5 is less than 7, the condition is satisfied, and x is assigned the value of value1, which is 10. 

public class Main {
    public static void main(String[] args) {
        int value1 = 10;
        int weight1 = 5;
        int value2 = 8;
        int weight2 = 4;
        int maxW = 7;
        int result = knapsackLight(value1, weight1, value2, weight2, maxW);
        System.out.println("Maximum value: " + result);
    }
    
    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int x = 0;
        if (weight1 + weight2 <= maxW) {
            x = value1 + value2;
        } else {
            if (value1 > value2) {
                if (weight1 <= maxW) {
                    x = value1;
                } else if (weight2 <= maxW) {
                    x = value2;
                } else {
                    x = 0;
                }
            } else {
                if (weight2 <= maxW) {
                    x = value2;
                } else if (weight1 <= maxW) {
                    x = value1;
                } else {
                    x = 0;
                }
            }
        }
        return x;
    }
}
