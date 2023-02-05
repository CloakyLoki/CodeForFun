package leetcode.arrays;

import java.util.Arrays;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any
leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
public class PlusOne {

    public static void main(String[] args) {

        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {

        int simpleIncrement = 0;
        boolean flagToIncrease = false;

        for (int i = 0; i < digits.length - 1; i++) {
            simpleIncrement++;

            if (digits[digits.length - 1] != 9 && simpleIncrement == 1) {
                digits[digits.length - 1]++;
                break;
            }
            if (digits[i] == 9 && i == 0) {
                flagToIncrease = true;
                break;
            }
            if (digits[i + 1] == 9) {
                digits[i + 1] = 0;
                digits[i]++;
            }
        }
        if (flagToIncrease) {
            int increasedArray[] = new int[digits.length + 1];
            increasedArray[0] = 1;
            return increasedArray;
        }
        return digits;
    }
}
