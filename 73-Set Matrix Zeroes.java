//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// here we contain other 2D matrix that have same rows and columns 
// we set 1 in checkMatrix where 0 in real matrix by this we contain all the element which have value 0 and then set all the row and column to 0 in real matrix

//time compecity O(n2) 

class Solution {
    public void setZeroes(int[][] matrix) {
        int m, n;
        m = matrix.length;
        n = matrix[0].length;
        int[][] checkMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {

                    checkMatrix[i][j] = 1;

                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checkMatrix[i][j] == 1) {

                    for (int k = 0; k < m; k++) {
                        matrix[k][j] = 0;
                    }
                    for (int k = 0; k < n; k++) {
                        matrix[i][k] = 0;
                    }
                }
            }
        }

    }
}