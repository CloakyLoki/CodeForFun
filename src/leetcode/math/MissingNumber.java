package leetcode.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0...3]. 2 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int ans = -1;
        Set<Integer> digits = new HashSet<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            digits.add(nums[i]);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (digits.add(i)) ans = i;
        }
        return ans;
    }
}
