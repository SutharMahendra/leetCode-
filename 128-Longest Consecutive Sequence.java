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