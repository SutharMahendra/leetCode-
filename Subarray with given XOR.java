import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int xor = 0;
        map.put(0, 1);
        int pivot = 1;
        for (int i = 0; i < A.size(); i++) {
            xor = xor ^ A.get(i);

            int x = xor ^ B;

            if (map.containsKey(x)) {
                count += map.get(x);
            } else {
                map.put(xor, map.getOrDefault(xor, 0) + 1);
            }
        }
        return count;
    }
}
