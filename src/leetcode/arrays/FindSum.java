package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Дан одномерный массив, отсортированный по возрастанию. Дано значение K. Найти в массиве два слагаемых, дающих K
 */
public class FindSum {
    public static void main(String[] args) {
        int[] nums = {0,5};
        int k = 5;
        System.out.println(Arrays.toString((solution(nums, k))));
    }

    static int[] solution(int[] values, int k) {
        int[] result = new int[2];
        Map<Integer, Integer> valMap = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            valMap.put(values[i], i);
        }

        for (int i = 0; i < values.length; i++) {
            if (valMap.containsKey(k - values[i])){
                result[0] = i;
                result[1] = valMap.get(k - values[i]);
            }
        }
        return result;
    }


}
