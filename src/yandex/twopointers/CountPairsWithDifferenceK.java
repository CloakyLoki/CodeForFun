package yandex.twopointers;

/**
 * Дана отсортированная последовательность чисел длиной N и число K.
 * Найти количество пар чисел A и B, таких, что B-A > K.
 */
public class CountPairsWithDifferenceK {

    public static void main(String[] args) {
        int[] sortedNums = {1, 3, 5, 7, 8};
        int k = 4;

        System.out.println(findPairs(sortedNums, k));
    }

    public static int findPairs(int[] nums, int k) {
        int ans = 0;
        int right = 0;
        for (int left : nums) {
            while (right < nums.length && nums[right] - nums[left] <= k) {
                right++;
            }
            ans += nums.length - right;
        }
        return ans;
    }
}
