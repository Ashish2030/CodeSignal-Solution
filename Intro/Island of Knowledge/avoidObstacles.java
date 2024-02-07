/*The logic in this code is to find the smallest jump length required to avoid obstacles. 
It does so by iterating through the given array of obstacle heights and finding the maximum height.
Then, it checks for each possible jump length from 1 to (max + 1) if any obstacle height is
divisible by that jump length. If none are divisible, it returns that jump length as the smallest one.
If all jump lengths are divisible by some obstacle height, it returns 0.
The main function initializes an array of obstacle heights, calls the avoidObstacles function,
and prints*/

public class AvoidObstacles {
    public static int avoidObstacles(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i <= max + 1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 7, 9};

        int result = avoidObstacles(arr);
        System.out.println("Smallest jump length to avoid obstacles: " + result);
    }
}
