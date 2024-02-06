//  extractEachKth method successfully extracted every 3rd element from the input array and returned an array 
// containing the remaining elements. In this case, the extracted array is [1, 2, 4, 5, 7, 8, 10]. 
// The method uses a flag (flag) to determine if any elements were extracted. If no elements were extracted, 
// it returns the original input array. Otherwise, it creates a new array (arr1) to store the remaining elements and returns it.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int[] result = extractEachKth(inputArray, k);
        System.out.println("Extracted array: " + Arrays.toString(result));
    }
    
    public static int[] extractEachKth(int[] inputArray, int k) {
        int[] arr = new int[inputArray.length];
        int q = 0;
        int p = 0;
        int count = 1;
        int flag = 1;
        
        for (int i = 0; i < inputArray.length; i++) {
            if (count == k) {
                count = 1;
                arr[i] = 10101;
                flag = 0;
            } else {
                arr[i] = inputArray[i];
                count++;
                q++;
            }
        }
        
        if (flag == 1) {
            return inputArray;
        } else {
            int[] arr1 = new int[q];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 10101) {
                    
                } else {
                    arr1[p] = arr[i];
                    p++;
                }
            }
            return arr1;
        }
    }
}
