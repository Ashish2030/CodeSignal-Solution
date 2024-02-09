// The code initializes max and pro variables. It then iterates through the array, calculating the product of each 
// pair of adjacent elements and updating the maximum product if a larger product is found. 
// Finally, it returns the maximum product of adjacent elements in the array.

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        int result = adjacentElementsProduct(inputArray);
        System.out.println("Maximum adjacent product: " + result);
    }

    public static int adjacentElementsProduct(int[] inputArray) {
        int max = -999;
        int pro = 1;
        
        for (int i = 0; i < inputArray.length - 1; i++) {
            pro = inputArray[i] * inputArray[i + 1];
            
            if (pro > max) {
                max = pro;
            }
        }
        
        return max;
    }
}
