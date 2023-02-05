package leetcode.arrays;

import java.util.Arrays;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//        Notice that the solution set must not contain duplicate triplets.
//Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
public class FindTriplets {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        for (int i = 0; i < findTriplets(nums).length; i++) {
            for (int j = 0; j < findTriplets(nums).length; j++) {
                System.out.println(findTriplets(nums)[i][j]);
            }
        }
    }

    private static int[][] findTriplets(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length ; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0 && i != j && j != k) {
                        return new int[][]  {{nums[i], nums[j], nums[k]}};
                        }
                }
            }
        } return new int[0][0];
    }

}
