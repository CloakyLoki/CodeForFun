package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

 */
public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1};
        int[] arr2 = {1, 2};
        int[] arr3 = {3,2,1};

        /*
        fm = 2
        sm = ----
        tm = ----
        c = 1

        fm = 2
        sm = ----
        tm = ----
        c = 1

        fm = 3
        sm = fm = 2
        c = 2
        c > 2 && nums[i] > tm && !set.contains(nums[i]) -> tm = nums[i]
         */

        System.out.println(thirdMax(arr));
//        System.out.println(thirdMax(arr2));
//        System.out.println(thirdMax(arr3));
    }

    public static int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
//                secondMax = firstMax;
                firstMax = nums[i];
                set.add(nums[i]);
            }
            if (nums[i] > secondMax && nums[i] < firstMax) {
                secondMax = nums[i];
                set.add(nums[i]);
            }
            if(set.size() > 1 && nums[i] > thirdMax && !set.contains(nums[i])){
                thirdMax = nums[i];
            }


        }

        if (thirdMax == Integer.MIN_VALUE) {
            return firstMax;
        } else {
            return thirdMax;
        }
    }
}
