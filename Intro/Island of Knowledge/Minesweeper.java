int[][] minesweeper(boolean[][] matrix) 
{
  
        int[][] a = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int bomb = 0;
                if(j - 1 >= 0){ // check left
                    if(matrix[i][j - 1])
                        bomb++;
                }
                if(j + 1 < matrix[i].length){ // check right
                    if(matrix[i][j + 1])
                        bomb++;
                }
                if(i - 1 >= 0){ // check up
                    if(matrix[i - 1][j])
                        bomb++;
                }
                if(i + 1 < matrix.length){ // check down
                    if(matrix[i + 1][j])
                        bomb++;
                }
                if(i - 1 >= 0 && j - 1 >= 0){ // check upper left
                    if(matrix[i - 1][j - 1])
                        bomb++;
                }
                if(i - 1 >= 0 && j + 1 < matrix[i].length){ // check upper right
                    if(matrix[i - 1][j + 1])
                        bomb++;
                }
                if(i + 1 < matrix.length && j - 1 >= 0){ // check down left
                    if(matrix[i + 1][j - 1])
                        bomb++;
                }
                if(i + 1 < matrix.length && j + 1 < matrix[i].length){ // check down right
                    if(matrix[i + 1][j + 1])
                        bomb++;
                }
                a[i][j] = bomb;
                bomb = 0;
            }
        }

        return a;
    }
