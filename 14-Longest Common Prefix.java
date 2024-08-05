//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

// here we create prefix that contains first string of string array
// now we compare first string with other string
// every time we remove last character of string and again compare

/*Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}