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