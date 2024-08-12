/*
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * 
 * Example 1:

    Input: nums = [3,2,3]
    Output: [3]

 * here we use map because we don't want to store duplicate value
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // sort the array
        Arrays.sort(nums);

        int count = 1;

        int n = nums.length;
        List majority = new ArrayList<>();
        // initialization of map
        Map<Integer, Integer> map = new HashMap();
        // start iteration from second element to last element of array
        for (int i = 1; i < n; i++) {
            // it check if current element is equals to previous element then it increament
            // count
            if (nums[i] == nums[i - 1]) {
                count++;
            }
            // if check till the different element can not find
            // now it check that count is more than n/3 if it is then store the element as
            // key of map and count as value of map
            else {

                if (count > n / 3) {

                    map.put(nums[i - 1], count);

                }
                count = 1;

            }

        }
        // this if condition is for the last element of the array
        // if last element is the majority element then again store it in map
        if (count > n / 3) {
            map.put(nums[n - 1], count);
        }

        // all the element is store in list(majority)
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            majority.add(key.getKey());
        }
        return majority;
    }
}