//Given an integer numRows
//return the first numRows of Pascal's triangle.
/*
  Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
// here we create list of list means create one main list and for each rows we create list
// we find each element with help of combination method in which we use n!/(n-1)! for combination
// then add that element in list and if one list is complete for one row then that list is added in pascalTriangle list 

class Solution {

    public int combination(int n, int k) {
        if (k > n - k) {
            k = n - k;
        }
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                int elementOfTriangle = combination(i, j);
                list.add(elementOfTriangle);
            }
            pascalTriangle.add(list);
        }
        return pascalTriangle;
    }
}
