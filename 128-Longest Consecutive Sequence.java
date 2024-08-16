/*
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence
 * 
 * Example 1:

    Input: nums = [100,4,200,1,3,2]
    Output: 4
    Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

    first of all sort the array [1,2,3,4,100,200]

    let's take iteration (start from second element)
     1. element = nums[1-1] + 1 = 1 + 1 = 2
        count  = 2; (nums[1] == nums[0])
     2. element = nums[2-1] + 1 = 2 + 1 = 3
        count  = 3; (nums[2] == nums[1]) 
     3. element = nums[3-1] + 1 = 3 + 1 = 4
        count  = 4; (nums[3] == nums[2])
     4. element = nums[4-1] + 1 = 4 + 1 = 5
        result  = 4 (nums[4]!=nums[3]) 
        count = 1
     5. element = nums[5-1] + 1 = 100 + 1 = 101
        result  = 4 (nums[5]!=nums[4]) 
        count = 1

    whenever itaration is finish it checks maximum between count and result for the last element 
 */

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int count = 1;
        int n = nums.length;
        int result = 1;

        if (n == 0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            int element = nums[i - 1] + 1;
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == element) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 1;
            }
        }
        result = Math.max(result, count);
        return result;
    }
}