// This means that the maximum sum of 3 consecutive elements in the array {1, 3, 2, 4, 5, 7} is 11, 
// according to the logic in the arrayMaxConsecutiveSum method. The method iterates through the array and 
// calculates the sum of each consecutive subarray of length k. It keeps track of the maximum sum found and returns 
// it at the end.

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 7};
        int k = 3;
        int result = arrayMaxConsecutiveSum(arr, k);
        System.out.println("Maximum consecutive sum: " + result);
    }
    
    public static int arrayMaxConsecutiveSum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int j = i + k - 1;
            
            if (j < arr.length) {
                for (int m = i; m <= j; m++) {
                    sum = sum + arr[m];
                }
                
                if (sum > max) {
                    max = sum;
                }
            }
        }
        
        return max;
    }
}
