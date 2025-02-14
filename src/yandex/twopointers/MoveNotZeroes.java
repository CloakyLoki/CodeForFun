package yandex.twopointers;

import java.util.Arrays;

/*
Дан целочисленный массив. Переставить все нулевые эелементы в конец, сохранива порядок ненулевых.
 */

public class MoveNotZeroes {

    public static void main(String[] args) {
        int[] arr = {2,0,0,8,9,3,1,0};
        int[] arr1 = {};
        int[] arr2 = {0};
        int[] arr3 = {1};

        moveNotZeros(arr);
    }

    private static void moveNotZeros(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                right++;
            } else {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }

        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
