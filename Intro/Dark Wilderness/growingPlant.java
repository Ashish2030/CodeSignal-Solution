// This means that it takes 4 days for the plant to reach the desired height of 10, given the growth speed of 5 
// unit per day and the decline speed of 2 units per day, according to the logic in the growingPlant method. On even 
// days, the plant grows by 5 units, and on odd days, it declines by 2 units. */

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
