//Initially, the sum variable is set to 0. The first loop iterates over the columns of the matrix, 
// and the second loop iterates over the rows. The code checks if each element is greater than 0 and adds 
// it to the sum. If an element is not greater than 0, the inner loop is terminated. After both loops finish, 
// the sum variable holds the total sum of all the valid elements in the matrix, which is then returned.

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = matrixElementsSum(matrix);
        System.out.println("Sum: " + sum);
    }
    
    public static int matrixElementsSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] > 0) {
                    sum += a[j][i];
                } else {
                    break;
                }
            }
        }
        return sum;
    }
}
