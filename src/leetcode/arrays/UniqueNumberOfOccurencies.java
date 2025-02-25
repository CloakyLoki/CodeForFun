package leetcode.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
Given an array of integers arr,
return true if the number of occurrences of each value in the array is unique or false otherwise.
 */
public class UniqueNumberOfOccurencies {

    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0, 0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            }
            set.add(entry.getValue());
        }
        return true;
    }
}
