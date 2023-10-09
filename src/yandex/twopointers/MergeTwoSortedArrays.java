package yandex.twopointers;

import java.util.Arrays;

/**
 * Даны две отсортированные последовательности чисел длиной N и M соответственно.
 * Необходимо слить их в одну отсортированную последовательность.
 * https://www.youtube.com/live/de28y8Dcvkg?si=WeD5ycZa54g1gg3K&t=2802
 */
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 7};
        int[] nums2 = {1, 1, 3, 5, 6, 6, 6};
        System.out.println(Arrays.toString(mergeArrays(nums1, nums2)));
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int nums1Pos = 0;
        int nums2Pos = 0;
        int ansPos = 0;

        while (nums1Pos < nums1.length && nums2Pos < nums2.length) {
            if (nums1[nums1Pos] < nums2[nums2Pos]) {
                ans[ansPos++] = nums1[nums1Pos++];
            } else {
                ans[ansPos++] = nums2[nums2Pos++];
            }
        }
        while (nums1Pos < nums1.length) {
            ans[ansPos++] = nums1[nums1Pos++];
        }
        while (nums2Pos < nums2.length) {
            ans[ansPos++] = nums2[nums2Pos++];
        }
        return ans;
    }
}
