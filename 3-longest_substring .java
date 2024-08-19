/*
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
    Example 1:

    Input: s = "abcab"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    as input we have string 
    now iterate loop 

    0. character = a
        character put in map with index 0
        map = {a:0}
        maxlen = (0 , 0-0+1) = 1
    
    1. character = b
        character put in map with index 1
        map = {a:0, b:1}
        maxlen = (1 , 1-0+1) = 2
    
    2. character = c
        character put in map with index 2
        map = {a:0, b:1, c:2}
        maxlen = (2 , 2-0+1) = 3

    3. character = a
       
        map contains a and value on "a" is >=left so 
        left = 0 + 1 = 1
        map = {a:0, b:1, c:2, a:3}
        maxlen = (3 , 3-1+1) = 3

    4. character = b
        map contains b and value on "a" is >=left so 
        left = 1 + 1 = 2
        map = {a:0, b:1, c:2, a:3, b:4}
        maxlen = (3 , 3-2+1) = 3
    
        so the final answer is 3 
    
 
 */

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