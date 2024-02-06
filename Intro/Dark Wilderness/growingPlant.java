// This means that it takes 4 days for the plant to reach the desired height of 10, given the growth speed of 5 
// unit per day and the decline speed of 2 units per day, according to the logic in the growingPlant method. On even 
// days, the plant grows by 5 units, and on odd days, it declines by 2 units. */

public class Main {
    public static void main(String[] args) {
        int upSpeed = 5;
        int downSpeed = 2;
        int desiredHeight = 10;
        int result = growingPlant(upSpeed, downSpeed, desiredHeight);
        System.out.println("Number of days: " + result);
    }
    
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int count = 0;
        int count1 = 0;
        int x = 0;
        
        while (true) {
            if (x >= desiredHeight) {
                break;
            }
            
            if (count % 2 == 0) {
                x = x + upSpeed;
                count1++;
                count++;
            } else {
                x = x - downSpeed;
                count++;
            }
        }
        
        return count1;
    }
}
