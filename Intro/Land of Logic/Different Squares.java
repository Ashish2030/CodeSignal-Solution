int differentSquares(int[][] matrix) {
    HashSet<String> set = new HashSet<>();;
        for (int i = 0; i < matrix.length - 1; i++){
            for (int j = 0; j < matrix[0].length - 1; j++){
                String temp = String.valueOf(matrix[i][j]) + 
                              String.valueOf(matrix[i][j+1]) +
                              String.valueOf(matrix[i+1][j]) +
                              String.valueOf(matrix[i+1][j+1]);
                set.add(temp);
            }
        }
        return set.size();
}