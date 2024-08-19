import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        char character;
        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            character = s.charAt(i);
            if (map.containsKey(character) && map.get(character) >= left) {
                left = map.get(character) + 1;
            }

            map.put(character, i);

            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }
}