package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Дан одномерный массив, отсортированный по возрастанию. Дано значение K. Найти в массиве два слагаемых, дающих K
 */
public class FindSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int k = 9;
        System.out.println(Arrays.toString((solutionTwoPointers(nums, k))));
    }

    static int[] solutionHashMap(int[] values, int k) {
        int[] result = new int[2];
        Map<Integer, Integer> valMap = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            valMap.put(values[i], i);
        }

        for (int i = 0; i < values.length; i++) {
            if (valMap.containsKey(k - values[i])) {
                result[0] = i;
                result[1] = valMap.get(k - values[i]);
            }
        }
        return result;
    }

    public static int[] solutionTwoPointers(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] < k) {
                left++;
            } else if (nums[left] + nums[right] > k) {
                right--;
            } else {
                break;
            }
        }
        return new int[]{left, right};
    }


}
