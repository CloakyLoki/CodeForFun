package yandex.prefixsum;

/**
 * RSQ (Range Sum Query)
 */
public class PrefixSumGeneral {

    public static void main(String[] args) {
        //            0  1  2  3  4  5
        int[] nums = {5, 3, 8, 1, 4, 6}; //включая левую границу, исключая правую (8+1+4 = 13)
        System.out.println(rsq(nums, 2, 5));
    }

    public static int rsq(int[] nums, int left, int right) {
        return makePrefixSum(nums)[right] - makePrefixSum(nums)[left];
    }

    public static int[] makePrefixSum(int[] nums) {
        int[] prefixSum = new int[nums.length + 1]; //массив сумм всегда на 1 больше исходного массива. Первый элемент 0.
        for (int i = 1; i < nums.length + 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        return prefixSum;
    }
}
