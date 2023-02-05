package leetcode.arrays;
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

//Input: nums = [1,1,0,1,1,1]
//        Output: 3
public class FindMaxConsecutiveOnes {
            public static void main(String[] args) {
            int[] nums = {1,1,0,1,1,1,0,0,1};
            System.out.println(findMaxConsecutiveOnes(nums));
        }
        public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentMax = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1){
                    currentMax++;
                    if (max < currentMax){
                        max = currentMax;
                    }
                } else {
                    currentMax = 0;
                }
            } return max;
        }
    }

