/*The code generates a 2D array, spiral, of size n by n, filled with spiral numbers. 
It uses four variables, k, l, m, and n, to keep track of the boundaries of the spiral. 
The count variable is used to assign the numbers in the spiral.
The code iterates through the spiral's layers and fills each layer with numbers by moving in a clockwise direction. 
It starts by filling the top row, then the rightmost column, then the bottom row (if applicable), 
and finally the leftmost column (if applicable). The boundaries of the spiral are adjusted accordingly after each layer is filled.*/

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = spiralNumbers(n);
        
        // Print the spiral numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static int[][] spiralNumbers(int n) {
        int[][] arr = new int[n][n];
        int m = n;
        int k = 0;
        int l = 0;
        int count = 1;
        
        while (k < m && l < n) {
            // Fill the top row
            for (int i = l; i < n; i++) {
                arr[k][i] = count;
                count++;
            }
            k++;
            
            // Fill the rightmost column
            for (int i = k; i < m; i++) {
                arr[i][n - 1] = count;
                count++;
            }
            n--;
            
            // Fill the bottom row (if applicable)
            if (k < m) {
                for (int i = n - 1; i >= l; i--) {
                    arr[m - 1][i] = count++;
                }
                m--;
            }
            
            // Fill the leftmost column (if applicable)
            if (l < n) {
                for (int i = m - 1; i >= k; i--) {
                    arr[i][l] = count++;
                }
                l++;
            }
        }
        
        return arr;
    }
}
