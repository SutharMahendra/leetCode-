// Given an integer x, return true if x is a palindrome, and false otherwise.
/*Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left. */

// simple solution is that we convert integer in string 
// now we eassly find reverse even thought if it is negative number

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            str1 = str.charAt(i) + str1;
        }
        if (str1.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}