package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
Find the two elements that appear only once. You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
 */
public class SingleNumberIII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(nums)));

    }

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
                numMap.put(nums[i], numMap.get(nums[i]) + 1);
            } else {
                numMap.put(nums[i], 0);
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry :
                numMap.entrySet()) {
            if (entry.getValue().equals(0)) {
                result[i++] = entry.getKey();
            }
        }
        return result;
    }
}
