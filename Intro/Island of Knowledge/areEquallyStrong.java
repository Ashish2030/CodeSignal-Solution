/*The areEquallyStrong function checks if two individuals have the same strength in their left and 
right arms. It creates two arrays to store the arm strengths of both individuals and sorts them 
in ascending order. Then, it compares the corresponding elements of the arrays, returning false 
if any pair of elements is not equal. If all pairs are equal, it returns true, indicating that the 
individuals are equally strong.*/

import java.util.Arrays;

public class StrengthChecker {
    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int[] arr = new int[2];
        int[] arr1 = new int[2];
        arr[0] = yourRight;
        arr[1] = yourLeft;
        arr1[0] = friendsRight;
        arr1[1] = friendsLeft;
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i = 0; i < 2; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 10;
        int friendsRight = 15;

        boolean result = areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight);
        System.out.println("Are you and your friend equally strong? " + result);
    }
}
