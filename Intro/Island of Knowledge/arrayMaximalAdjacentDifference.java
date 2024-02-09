/*arrayMaximalAdjacentDifference function calculates the maximum difference between adjacent elements 
in an input array. It initializes a variable max to the minimum possible value and iterates over the 
array, comparing the absolute difference between each element and its adjacent element. 
If the absolute difference is greater than the current maximum, the max value is updated. 
Finally, the function returns the maximum difference found.*/

public class MaximalAdjacentDifference {
    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (Math.abs(inputArray[i] - inputArray[i + 1]) > max) {
                max = Math.abs(inputArray[i] - inputArray[i + 1]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 4, 1, 9, 5, 3};

        int result = arrayMaximalAdjacentDifference(inputArray);
        System.out.println("Maximal adjacent difference: " + result);
    }
}
