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