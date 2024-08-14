/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2] 

    explaination of iteration 
    1. complement = 6-3 = 3
        map = {}
        add 3 in map (here add element as key)
    2. complement = 6-2 = 4
        map = {3}
        map not contain 4 so,
        add 2 in map
    3. complement = 6-4 = 2
        map = {3,2}
        now map contains 2 so it return new int arr with element complement and i

 */

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // iterate each element
        for (int i = 0; i < nums.length; i++) {
            // define complement
            int complement = target - nums[i];

            // if find complement in map
            // if map contains complenment then return that ans
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // otherwise we put that nums[i] into the map
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
