//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
/*
 * Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000

here we use recursion method to solve this problem

 */
class Solution {
    public double myPow(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        double pow = myPow(x, n / 2);
        double result = pow * pow;
        if (n % 2 != 0) {
            if (n >= 0) {
                result *= x;
            } else {
                result *= 1 / x;
            }
        }
        return result;
    }
}