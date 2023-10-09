package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class MajorityElement {

    // Sorting (искомый элемент точно должен быть и на центральной позиции массива, т.к. по условию их больше половины)
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    // HashMap
    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int ret=0;
        for (int num: nums) {
            if (!myMap.containsKey(num))
                myMap.put(num, 1);
            else
                myMap.put(num, myMap.get(num)+1);
            if (myMap.get(num)>nums.length/2) {
                ret = num;
                break;
            }
        }
        return ret;
    }
}
