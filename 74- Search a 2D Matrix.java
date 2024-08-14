/*
 * You are given an m x n integer matrix matrix with the following two properties:

  1.Each row is sorted in non-decreasing order.
  2.The first integer of each row is greater than the last integer of the previous row.

  Given an integer target, return true if target is in matrix or false otherwise.

  Example 1:

  Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
  Output: true

  use binary search for every row
 */

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