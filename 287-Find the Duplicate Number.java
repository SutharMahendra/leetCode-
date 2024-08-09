//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.

/*
 * Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
 */
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int element = nums[i];
            if (map.containsKey(element)) {
                return element;
            }
            map.put(element, i);
        }

        return 0;
    }
}