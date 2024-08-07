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