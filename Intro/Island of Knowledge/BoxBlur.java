/*The code defines a class called BoxBlur that contains two methods. The squareMatrix method 
calculates the average value of a 3x3 matrix of integers. The boxBlur method takes an image 
represented as a 2D array of integers, divides it into overlapping 3x3 squares, 
calculates the average value for each square using the squareMatrix method, and returns the 
resulting blurred image as a 2D array of integers. The main method demonstrates the usage of the
boxBlur method by applying it to a sample image and printing the blurred image to the console.*/

import java.util.ArrayList;
import java.util.List;

public class BoxBlur {
    public static int squareMatrix(int[][] square) {
        int totSum = 0;

        // Calculate sum of all the pixels in the 3x3 matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totSum += square[i][j];
            }
        }

        return totSum / 9; // Return the average of the sum of pixels
    }

    public static int[][] boxBlur(int[][] image) {
        List<int[]> blurImg = new ArrayList<>();

        int nRows = image.length; // Number of rows in the given image
        int nCols = image[0].length; // Number of columns in the given image

        int rp = 0; // Row pointer
        int cp = 0; // Column pointer

        // This while loop will be used to calculate all the blurred pixels in the first row
        while (rp <= nRows - 3) {
            List<int[][]> rowList = new ArrayList<>();

            while (cp <= nCols - 3) {
                int[][] square = new int[3][3];

                for (int i = rp; i < rp + 3; i++) {
                    for (int j = cp; j < cp + 3; j++) {
                        square[i - rp][j - cp] = image[i][j];
                    }
                }

                rowList.add(square);
                cp++;
            }

            int[] blurRow = new int[rowList.size()];
            for (int i = 0; i < rowList.size(); i++) {
                blurRow[i] = squareMatrix(rowList.get(i));
            }

            blurImg.add(blurRow);

            rp++;
            cp = 0;
        }

        int[][] blurredImage = new int[blurImg.size()][];
        for (int i = 0; i < blurImg.size(); i++) {
            blurredImage[i] = blurImg.get(i);
        }

        return blurredImage; // Return the resulting blurred image
    }

    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1},
            {1, 7, 1},
            {1, 1, 1}
        };

        int[][] blurredImage = boxBlur(image);
        for (int[] row : blurredImage) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
