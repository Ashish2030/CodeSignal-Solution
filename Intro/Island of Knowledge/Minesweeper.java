/*The given code implements a Minesweeper game. It takes a boolean matrix as input, 
where true represents a bomb and false represents an empty cell. The code iterates over 
each cell in the matrix, counts the number of neighboring bombs for each cell, 
and stores the counts in a new integer matrix. Finally, it returns the matrix 
with the bomb counts and prints it to the console.*/

public class Minesweeper {
    public static int[][] minesweeper(boolean[][] matrix) {
        int[][] a = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int bomb = 0;
                if (j - 1 >= 0) { // check left
                    if (matrix[i][j - 1])
                        bomb++;
                }
                if (j + 1 < matrix[i].length) { // check right
                    if (matrix[i][j + 1])
                        bomb++;
                }
                if (i - 1 >= 0) { // check up
                    if (matrix[i - 1][j])
                        bomb++;
                }
                if (i + 1 < matrix.length) { // check down
                    if (matrix[i + 1][j])
                        bomb++;
                }
                if (i - 1 >= 0 && j - 1 >= 0) { // check upper left
                    if (matrix[i - 1][j - 1])
                        bomb++;
                }
                if (i - 1 >= 0 && j + 1 < matrix[i].length) { // check upper right
                    if (matrix[i - 1][j + 1])
                        bomb++;
                }
                if (i + 1 < matrix.length && j - 1 >= 0) { // check down left
                    if (matrix[i + 1][j - 1])
                        bomb++;
                }
                if (i + 1 < matrix.length && j + 1 < matrix[i].length) { // check down right
                    if (matrix[i + 1][j + 1])
                        bomb++;
                }
                a[i][j] = bomb;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        boolean[][] matrix = {
            {true, false, false, false},
            {false, true, false, false},
            {false, false, false, true},
            {false, false, true, false}
        };

        int[][] result = minesweeper(matrix);

        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
