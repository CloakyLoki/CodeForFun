package leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {4, 7, 9, 7, 6, 7};
        int[] nums2 = {5, 0, 0, 6, 1, 6, 2, 2, 4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums1) {
            numSet.add(num);
        }
        for (int num : nums2) {
            if (numSet.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] ans = new int[resultSet.size()];
        int i = 0;
        for (Integer integer : resultSet) {
            ans[i++] = (int) integer;
        }
        return ans;
    }
}
