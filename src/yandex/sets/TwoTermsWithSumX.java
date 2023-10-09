package yandex.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Дана последовательность положительных чисел длиной N и число X.
 * Найти два различных числа A и B, таких, что A+B=X или вернуть пару [0,0], если такой пары чисел нет.
 * https://www.youtube.com/live/PUpmV2ieIHA?si=Ylcwh8s49U55ld8o&t=2610
 */
public class TwoTermsWithSumX {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 8, 56, 5};
        int target = 7;
        System.out.println(Arrays.toString(solution(nums, target)));
    }

    public static int[] solution(int nums[], int x) {
        int[] ans = {0, 0};
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(x - num)) {
                ans[0] = num;
                ans[1] = x - num;
                return ans;
            }
            numSet.add(num);
        }
        return ans;
    }
}
