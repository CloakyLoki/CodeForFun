package leetcode.arrays;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,-4,-1};
        System.out.println((getMaxContiguous(nums)));

    }

    public static int getMaxContiguous(int[] array) {
        int currentMax = 0;
        int maxSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxSum) {
                maxSum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            currentMax += array[i];
//            if(currentMax < 0){
//                currentMax = 0;
//            } else
            if (maxSum < currentMax) {
                maxSum = currentMax;
            }
                }
        return maxSum;
    }


}
