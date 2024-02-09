/*Sudoku method checks if the rows, columns, and 3x3 subgrids of the Sudoku grid are in increasing 
order from 1 to 9 without repetition. It accomplishes this by calling the x method to check each row,
column, and subgrid individually.*/

import java.util.Arrays;

public class Main {
    static boolean x(int arr[]) {
        Arrays.sort(arr);
        int k = 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                return false;
            } else {
                k++;
            }
        }
        
        return true;
    }
    
    boolean sudoku(int[][] grid) {
        int[] arr = new int[grid.length];
        int[] arr1 = new int[grid.length];
        int k1 = 0;
        
        for (int i = 0; i < grid.length; i++) {
            k1 = 0;
            
            for (int j = 0; j < grid[0].length; j++) {
                arr[k1] = grid[i][j];
                arr1[k1] = grid[j][i];
                k1++;
            }
            
            boolean t = x(arr);
            boolean t1 = x(arr1);
            
            if (!t1 || !t) {
                return false;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                k1 = 0;
                
                for (int k = i * 3; k < (i + 1) * 3; k++) {
                    for (int l = j * 3; l < (j + 1) * 3; l++) {
                        arr[k1] = grid[k][l];
                        k1++;
                    }
                }
                
                if (!x(arr)) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        Main main = new Main();
        boolean isSudokuValid = main.sudoku(grid);
        System.out.println("Is Sudoku Valid? " + isSudokuValid);
    }
}
