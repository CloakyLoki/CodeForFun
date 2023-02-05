package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums where every element appears three times except for one, which appears exactly once.
Find the single element and return it.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Input: nums = [0,1,0,1,0,1,99]
Output: 99
 */
public class SingleNumberII {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        //System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
                numMap.put(nums[i], numMap.get(nums[i]) + 1);
            } else {
                numMap.put(nums[i], 0);
            }
        }
        for (Map.Entry<Integer, Integer> entry :
                numMap.entrySet()) {
            if (entry.getValue().equals(0)) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
