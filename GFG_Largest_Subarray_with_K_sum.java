import java.util.*;

public class GFG_Largest_Subarray_with_K_sum {
    public static void main(String[] args) {
        int arr[] = { 2, 10, 4 };
        int n = arr.length;

        int max_length = Largest_Subarray_with_K_sum(arr, n);
        System.out.println(max_length);
    }

    public static int Largest_Subarray_with_K_sum(int[] arr, int n) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max_length = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                max_length = i + 1;
            }
            if (map.containsKey(sum)) {
                max_length = Math.max(max_length, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max_length;
    }
}
