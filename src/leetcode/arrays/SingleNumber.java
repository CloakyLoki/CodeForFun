package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        Set<Integer> valueSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (valueSet.add(nums[i])) {
                valueSet.add(nums[i]);
            } else valueSet.remove(nums[i]);
        }
        return valueSet.iterator().next();
    }
}
