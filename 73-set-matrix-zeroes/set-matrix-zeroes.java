public class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean colZero = false;  // Flag to track if 0th column should be zero

        // Step 1: Use matrix itself to mark zeroes, starting from top-left
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                colZero = true;
            }

            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark column
                }
            }
        }

        // Step 2: Iterate in reverse to update the matrix in-place
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (colZero) {
                matrix[i][0] = 0;
            }
        }
    }
}
