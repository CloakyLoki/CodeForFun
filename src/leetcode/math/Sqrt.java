package leetcode.math;

/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */
public class Sqrt {

    public static void main(String[] args) {
        int x = 0;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int result = 0;
        int subtrahend = 1;
        while (x >= subtrahend) {
            x -= subtrahend;
            subtrahend += 2;
            result++;
        }
        return result;
    }
}
