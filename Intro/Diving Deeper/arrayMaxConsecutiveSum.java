// This means that the maximum sum of 3 consecutive elements in the array {1, 3, 2, 4, 5, 7} is 11, 
// according to the logic in the arrayMaxConsecutiveSum method. The method iterates through the array and 
// calculates the sum of each consecutive subarray of length k. It keeps track of the maximum sum found and returns 
// it at the end.

public class Main {
    public static void main(String[] args) {
        // Define input values
        int[] arr = {1, 3, 2, 4, 5, 7};
        int k = 3;
        
        // Call the arrayMaxConsecutiveSum method with the input values
        int result = arrayMaxConsecutiveSum(arr, k);
        
        // Print the result
        System.out.println("Maximum consecutive sum: " + result);
    }
    
    public static int arrayMaxConsecutiveSum(int[] arr, int k) {
        // Initialize the maximum sum variable with the minimum possible value
        int max = Integer.MIN_VALUE;
        
        // Iterate over the array from index 0 to index arr.length - 1
        for (int i = 0; i < arr.length; i++) {
            // Initialize the sum variable to 0 at the beginning of each iteration
            int sum = 0;
            
            // Calculate the ending index of the consecutive subarray
            int j = i + k - 1;
            
            // Check if the ending index is within the array bounds
            if (j < arr.length) {
                // Calculate the sum of elements in the consecutive subarray
                for (int m = i; m <= j; m++) {
                    sum = sum + arr[m];
                }
                
                // Update the maximum sum if the current sum is greater
                if (sum > max) {
                    max = sum;
                }
            }
        }
        
        // Return the maximum consecutive sum
        return max;
    }
}
