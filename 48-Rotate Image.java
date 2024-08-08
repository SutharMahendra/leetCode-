//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
/* this is origanal arr
  | 1,2,3 |
  | 4,5,6 |
  | 7,8,9 |
  we make it like this
  | 7,4,1 |
  | 8,5,2 |
  | 9,6,3 |

 */
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