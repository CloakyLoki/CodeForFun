package leetcode.math;
/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8,
and -2.7335 would be truncated to -2.
Return the quotient after dividing dividend by divisor.
Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
 */

public class DivideTwoIntegers {

    public static void main(String[] args) {

        int dividend = Integer.MIN_VALUE;
        int divisor = 1;

        System.out.println(solution(dividend, divisor));
    }

    private static int solution(int dividend, int divisor) {
// TODO: 31.01.2023  incorrect -2147483648 / 2 division (Output -1073741826,  Expected -1073741824)
        int result = 0;
        int tempDividend;
        int tempDivisor;
        boolean isLong = false;

        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MAX_VALUE && divisor == 1){
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1){
            return -Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE) {
            if (divisor < 0) {
                tempDividend = dividend;
                tempDivisor = Math.abs(divisor);
                while (tempDividend <= tempDivisor) {
                    tempDividend += tempDivisor;
                    result++;
                }
            } else {
                tempDividend = dividend;
                tempDivisor = Math.abs(divisor);

                while (tempDividend <= tempDivisor) {
                    tempDividend += tempDivisor;
                    result++;
                }
            }
        } else {
            tempDividend = Math.abs(dividend);
            tempDivisor = Math.abs(divisor);

            while (tempDividend >= tempDivisor) {
                tempDividend -= tempDivisor;
                result++;
            }
        }
        if (isLong) {
            return result * Integer.signum(dividend) * Integer.signum(divisor) - 1;
        } else {
            return (result * Integer.signum(dividend) * Integer.signum(divisor));
        }
    }
}
