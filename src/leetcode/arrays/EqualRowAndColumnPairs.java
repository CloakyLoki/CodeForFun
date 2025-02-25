package leetcode.arrays;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 */
public class EqualRowAndColumnPairs {


    public static void main(String[] args) {
        int[][] arr = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        int[][] arr1 = {{13,13}, {13, 13}}; //неверный ответ, должно быть 4
        System.out.println(equalPairs(arr1));
    }

    public static int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        int res = 0;

        for (int r = 0; r < grid.length; r++) {
            List<Integer> row = new LinkedList<>();
            for (int c = 0; c < grid[r].length; c++) {
                row.add(grid[r][c]);
            }
            map.put(row, map.getOrDefault(row, -1) + 1);
        }

        for (int c = 0; c < grid.length; c++) {
            List<Integer> column = new LinkedList<>();
            for (int r = 0; r < grid.length; r++) {
                column.add(grid[r][c]);
            }
            if (map.containsKey(column)) {
                map.put(column, map.get(column) + 1);
            }
        }

        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            res += entry.getValue();
        }

        return res;
    }
}
