package leetcode.arrays;

import java.util.Arrays;

/*
Given an integer array nums,
return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
public class ProductOfArray {

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int[] arr2 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        System.out.println(Arrays.toString(productExceptSelf(arr2)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suf = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= suf;
            suf *= nums[i];
        }

        return ans;
    }
}
