//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.

/*
 * Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

//create new arr with length m+n
// all the element of nums1 and nums2 insert in arr
// then sort arr
// paste element of arr in nums1 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pivot = 0;
        int[] arr = new int[m + n];
        for (int i = 0; i < m; i++) {
            arr[pivot] = nums1[i];
            pivot++;
        }
        for (int i = 0; i < n; i++) {
            arr[pivot] = nums2[i];
            pivot++;
        }

        // for sorting
        m = m + n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < m; i++) {
            nums1[i] = arr[i];
        }
    }
}