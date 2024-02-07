/*The arrayChange method examines each element in the inputArray and checks if it is strictly 
greater than the previous element. If not, it performs an operation to increase the element 
and calculates the minimum number of operations required. In the given example, two operations 
are performed to make the array {1, 3, 5, 4, 2} strictly increasing, resulting in the 
array {1, 3, 5, 6, 7}. The total number of operations performed is 4, 
which is returned as the output.*/

public class ArrayChangeExample {
    public static void main(String[] args) {
        int[] inputArray = {1, 3, 5, 4, 2};
        int result = arrayChange(inputArray);
        System.out.println(result);
    }

    public static int arrayChange(int[] inputArray) {
        int result = 0;
        int x = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] >= inputArray[i]) {
                x = inputArray[i - 1] - inputArray[i] + 1;
                inputArray[i] = inputArray[i] + x;
                result = result + x;
            }
        }

        return result;
    }
}
