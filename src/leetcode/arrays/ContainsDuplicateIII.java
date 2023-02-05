package leetcode.arrays;

import java.util.TreeSet;

/*
You are given an integer array nums and two integers indexDiff and valueDiff.
Find a pair of indices (i, j) such that:

i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.

Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
Output: true
Explanation: We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
 */
public class ContainsDuplicateIII {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int indexDiff = 3;
        int valueDiff = 0;

        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums == null || nums.length < 2 || indexDiff < 1) return false;
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long l = (long) nums[i];
            Long floor = set.floor(l);
            Long ceil = set.ceiling(l);
            if ((floor != null && l - floor <= valueDiff) ||
                    (ceil != null && ceil - l <= valueDiff))
                return true;

            set.add(l);

            if (i >= indexDiff)
                set.remove((long) nums[i - indexDiff]);

        }
        return false;
    }
}