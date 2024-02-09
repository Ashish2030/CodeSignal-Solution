/*The arrayChange method takes an array inputArray containing {1, 3, 5, 4, 2} as input. 
It calculates the minimum number of operations required to make the array strictly increasing.
In this example, a total of 7 operations are performed to transform the array into {1, 3, 5, 6, 7},
where each element is strictly greater than the previous one.*/

public class ArrayChangeExample {
    public static void main(String[] args) {
        int[] inputArray = {1, 3, 5, 4, 2};
        int result = arrayChange(inputArray);
        System.out.println(result);
    }
// At index 2, an operation is performed to increase the element 5 to 4 since it is not strictly greater than the previous element 3. The difference x is calculated as 3 - 5 + 1 = -1, resulting in two operation.
// At index 3, an operation is performed to increase the element 4 to 6 since it is not strictly greater than the previous element 5. The difference x is calculated as 5 - 4 + 1 = 2, resulting in two operations.
// At index 4, an operation is performed to increase the element 2 to 5 since it is not strictly greater than the previous element 4. The difference x is calculated as 4 - 2 + 1 = 3, resulting in three operations.
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
