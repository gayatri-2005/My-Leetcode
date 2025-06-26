class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) return false;
        
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = (n * m) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;

            if (mat[row][col] == target) return true;
            else if (mat[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}