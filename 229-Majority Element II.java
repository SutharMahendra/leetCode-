class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;

        int n = nums.length;
        List majority = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();
        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {

                if (count > n / 3) {

                    map.put(nums[i - 1], count);

                }
                count = 1;

            }

        }
        if (count > n / 3) {
            map.put(nums[n - 1], count);
        }
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            majority.add(key.getKey());
        }
        return majority;
    }
}