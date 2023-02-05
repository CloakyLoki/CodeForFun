package leetcode.arrays;

import java.util.Arrays;

/*
Дан одномерный массив, отсортированный по возрастанию. Дано значение K. Найти в массиве два слагаемых, дающих K
 */
public class FindSum {
    public static void main(String[] args) {
        int[] nums = {-3, 0, 1, 3, 4};
        int k = 5;
        System.out.println(Arrays.toString((enumMethod(nums, k))));
                }

    static int[] enumMethod (int[] values, int k){
          for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] + values[j] == k){
                    return new int[] {values[i], values[j]};
                }
            }
        } return new int[0];

    }


}
