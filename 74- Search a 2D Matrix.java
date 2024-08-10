class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = matrix[i].length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                }
                if (matrix[i][mid] < target) {
                    start = mid + 1;
                }
                if (matrix[i][mid] > target) {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}