package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array
such that nums[i] == nums[j] and abs(i - j) <= k.

Input: nums = [1,2,3,1], k = 3
Output: true

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 7;

        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                if (Math.abs(i - numsMap.get(nums[i])) <= k) {
                    return true;
                }
            }
            numsMap.put(nums[i], i);
        }
        return false;
    }
}
