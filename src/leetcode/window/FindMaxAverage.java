package leetcode.window;

/**
 * @author Andrey Ananskiy
 */
public class FindMaxAverage {

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findAverageSliding(nums, 4));
    }


    public static double findMaxAverage(int[] nums, int k) {
        int currentMax = nums[0];

        for (int i = 1; i < k; i++) currentMax += nums[i];
        int max = currentMax;

        for (int right = k; right < nums.length; right++) {
            currentMax += nums[right] - nums[right - k];
            max = Math.max(max, currentMax);
        }

        return (double) max / k;
    }

    public static double findAverageSliding(int[] nums, int k) {
        int currentMax = nums[0];
        int max = nums[0];
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (right - left < k) {
                currentMax += nums[right];
                right++;
            }
            if (right - left + 1 == k && currentMax > max) {
                max = currentMax;
                currentMax = currentMax - nums[left];
                right++;
                left++;
            } else {
                currentMax = currentMax - nums[left];
                right++;
//1,12,-5,-6,50,3
            }
        }
        return (double) max / k;
    }
}
