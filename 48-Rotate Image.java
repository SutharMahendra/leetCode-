class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix[0].length;
        int[][] arr = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {

            for (k = 0; k < n; k++) {
                arr[k][(n - 1) - i] = matrix[i][k];
            }

        }

        for (int i = 0; i < n; i++) {

            for (k = 0; k < n; k++) {
                matrix[i][k] = arr[i][k];
            }

        }
    }
}