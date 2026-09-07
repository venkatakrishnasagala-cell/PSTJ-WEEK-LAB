class Solution {

    public int[][] matrixBlockSum(int[][] mat, int k) {

        int rows = mat.length;
        int columns = mat[0].length;

        int[][] prefix = new int[rows + 1][columns + 1];
        int[][] result = new int[rows][columns];

        for (int row = 1; row <= rows; row++) {

            for (int column = 1; column <= columns; column++) {

                prefix[row][column] =
                    mat[row - 1][column - 1]
                    + prefix[row - 1][column]
                    + prefix[row][column - 1]
                    - prefix[row - 1][column - 1];
            }
        }

        for (int row = 0; row < rows; row++) {

            for (int column = 0; column < columns; column++) {

                int top = Math.max(0, row - k);
                int left = Math.max(0, column - k);
                int bottom = Math.min(rows - 1, row + k);
                int right = Math.min(columns - 1, column + k);

                result[row][column] =
                    prefix[bottom + 1][right + 1]
                    - prefix[top][right + 1]
                    - prefix[bottom + 1][left]
                    + prefix[top][left];
            }
        }

        return result;
    }
}
