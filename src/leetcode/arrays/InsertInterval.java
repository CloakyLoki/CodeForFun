package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are given an array of non-overlapping intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * Return intervals after the insertion.
 *
 * Example 1:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 *
 * Example 2:
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */
//public class InsertInterval {
//    public static void main(String[] args) {
//        int[][] intervals = {{1, 3}, {6, 9}};
//        int[] newInterval = {2, 5};
//
//        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
//    }
//
//    public static int[][] insert(int[][] intervals, int[] newInterval) {
//        List<int[]> tempList = new ArrayList<>();
//
//        for (int i = 0; i < intervals.length; i++) {
//            if (newInterval > intervals[i][0] && )
//        }
//
//    }
//}
