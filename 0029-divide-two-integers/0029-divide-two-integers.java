class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long num1 = Math.abs((long) dividend);
        long num2 = Math.abs((long) divisor);

        int result = 0;

        while (num1 >= num2) {

            long temp = num2;
            int multiple = 1;

            // 🔥 double until possible
            while (num1 >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            num1 -= temp;
            result += multiple;
        }

        return (dividend < 0) ^ (divisor < 0) ? -result : result;
    }
}