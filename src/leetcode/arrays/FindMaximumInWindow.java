package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FindMaximumInWindow {

    public static void main(String[] args) {
        int[] nums = {1,2,2,0,7,1,10};
        int[] nums1 = {2,1,1,0,7,1,10};
        int k = 3;
        System.out.println(findMaximumInWindow(nums, k));
    }

    private static List<Integer> findMaximumInWindow(int[] nums, int k) {
        int max = nums[0];
        int indMax = 0;
        int left = 0;
        int right = 1;
        List<Integer> ans = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();

        while (right - left  != k){
            set.add(nums[right]);
            if (nums[right] >= max){
                max = nums[right];
                indMax = right;
            }
            right++;
        }
        ans.add(max);

        while (right < nums.length){
            left++;
            right++;

            if(indMax > left){
                ans.add(Math.max(nums[right], max));
            } else {

            }
        }

        return ans;
    }
}
