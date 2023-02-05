package leetcode.arrays;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//        Input: nums = [1,2,3,1]
//        Output: true
//
//        Input: nums = [1,2,3,4]
//        Output: false

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }
        return nums.length != values.size();
    }
}
