//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

/*
 * Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */

// simple method is that we find 0 insert first in arr and then 1 or 2 respectivlly.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int pivot = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                arr[pivot] = 0;
                pivot++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                arr[pivot] = 1;
                pivot++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 2) {
                arr[pivot] = 2;
                pivot++;
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

    }
}