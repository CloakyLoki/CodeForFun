package leetcode.math;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        int MIN_INT = Integer.MIN_VALUE;
        int MAX_INT = Integer.MAX_VALUE;
        int result = 0;
        int length = 0;

        if (x >= 0) {
            length = String.valueOf(x).length();
        } else {
            length = String.valueOf(x).length() - 1;
        }
        int pow = length;
        for (int i = 0; i < length; i++) {
            int temp = x % 10;
            if (result + temp * Math.pow(10, pow - 1) < MAX_INT && result + temp * Math.pow(10, pow - 1) > MIN_INT) {
                result += temp * Math.pow(10, pow - 1);
                pow--;
                x /= 10;
            } else return 0;
        }
        return result;
    }
}
