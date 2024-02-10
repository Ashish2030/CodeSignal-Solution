/* growingPlant method is called with upSpeed as 5, downSpeed as 2, and desiredHeight as 10. The method calculates the number of days it takes for the plant to reach the desired height.
In this case, the plant would reach a height of 10 units in 6 days, and the value 6 is printed to the console as the result.
Please note that the provided code assumes that the plant initially starts at height 0 and that the values of upSpeed, 
downSpeed, and desiredHeight are positive integers.*/

public class Main {
    public static void main(String[] args) {
        // Define input values
        int upSpeed = 5;
        int downSpeed = 2;
        int desiredHeight = 10;
        
        // Call the growingPlant method with the input values
        int result = growingPlant(upSpeed, downSpeed, desiredHeight);
        
        // Print the result
        System.out.println("Number of days: " + result);
    }
    
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        // Initialize variables
        int count = 0; // Total number of days
        int count1 = 0; // Number of days when the plant grows
        int x = 0; // Current height of the plant
        
        // Loop until the desired height is reached
        while (true) {
            // Check if the desired height is reached or exceeded
            if (x >= desiredHeight) {
                break;
            }
            
            // Check if the current day is even (count % 2 == 0)
            if (count % 2 == 0) {
                // Plant grows during the day
                x = x + upSpeed; // Increase the height by upSpeed
                count1++; // Increment the count of growing days
                count++; // Increment the total count of days
            } else {
                // Plant does not grow during the night
                x = x - downSpeed; // Decrease the height by downSpeed
                count++; // Increment the total count of days
            }
        }
        
        // Return the count1, which represents the number of days when the plant grows
        return count1;
    }
}
