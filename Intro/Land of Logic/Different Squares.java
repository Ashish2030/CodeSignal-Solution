/*The logic involves creating a HashSet to store unique square patterns. 
The matrix is iterated through with nested loops, forming 2x2 squares using 
cell values and concatenating them into string representations. 
These representations are added to the set, ensuring uniqueness. 
Finally, the size of the set is returned, representing the count of different square patterns found.*/

import java.util.HashSet;

public class Main {
    public static int differentSquares(int[][] matrix) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                String temp = String.valueOf(matrix[i][j]) +
                              String.valueOf(matrix[i][j + 1]) +
                              String.valueOf(matrix[i + 1][j]) +
                              String.valueOf(matrix[i + 1][j + 1]);
                set.add(temp);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int count = differentSquares(matrix);
        System.out.println("Number of different squares: " + count);
    }
}
