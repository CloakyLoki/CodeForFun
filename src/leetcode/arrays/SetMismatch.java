package leetcode.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]

 */
public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] arr1 = {2,2};

        System.out.println(Arrays.toString(findErrorNums(arr)));
        System.out.println(Arrays.toString(findErrorNums(arr1)));

    }

    public static int[] findErrorNums(int[] nums) {

        return new int[2];
    }
}
