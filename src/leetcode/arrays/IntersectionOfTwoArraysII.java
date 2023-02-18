package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        int[] num1 = {4, 9, 8, 9, 5};
        int[] num2 = {9, 4, 9, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(num1, num2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> num1Map = new HashMap<>();
        List<Integer> resList = new ArrayList<>();
        for (int value : nums2) {
            if (num1Map.containsKey(value)) {
                num1Map.put(value, num1Map.get(value) + 1);
            } else {
                num1Map.put(value, 1);
            }
        }
        for (int value : nums1) {
            if (num1Map.containsKey(value) && num1Map.get(value) != 0) {
                resList.add((int) value);
                num1Map.put(value, num1Map.get(value) - 1);
            }
        }
        int[] ans = new int[resList.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = resList.get(i);
        }
        return ans;
    }
}
