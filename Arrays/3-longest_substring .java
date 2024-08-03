
// Given a string {s}
//find the length of the longest substring without repeating characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        char character;
        int count = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            character = s.charAt(i);
            for (int j = 0; j < i; j++) {
                if (character == s.charAt(j)) {
                    s = s.substring(j + 1, s.length());
                    i = 0;
                    if (result < count) {
                        result = count;
                    }
                    count = 0;
                    break;
                }
            }
            count++;

        }

        if (result > count) {
            return result;
        } else {
            return count;
        }
    }
}
