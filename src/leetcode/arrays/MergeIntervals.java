package leetcode.arrays;

/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and
return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] ints = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        System.out.println(Arrays.deepToString(merge(ints)));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> ansList = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        int e, s;
        int i = 0;
        while (i < intervals.length) {
            s = intervals[i][0];
            e = intervals[i][1];
            if (s <= end)
                end = Math.max(end, e);
            else {
                ansList.add(new int[]{start, end});
                start = s;
                end = e;
            }
            i++;
        }
        ansList.add(new int[]{start, end});
        return ansList.toArray(new int[ansList.size()][]);
    }
}
