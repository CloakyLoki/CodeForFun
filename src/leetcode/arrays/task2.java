/*
Given an array nums of integers, return how many of them contain an even number of digits.
Input: nums = [12,345,2,6,7896]
https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
 */

package leetcode.arrays;
public class task2 {

    public static void main(String[] args) {

        int[] nums = {555,901,482,1771};
        System.out.println("Результат: " + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        int length;
        for (int i = 0; i < nums.length; i++) {
            length = 0;
            int j = 0;
            do {
                length++;
                j++;
            } while (nums[i] / Math.pow(10, j) >= 1);

            if (length % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}


