package yandex.prefixsum;

import java.util.HashMap;
import java.util.Map;

/**
 * Дана последовательность чисел длиной N.
 * Необходимо найти количество отрезков с нулевой суммой.
 * prefix:0 1  6 4 7 7 13 11 7 16
 * nums: 1 5 -2 3 0 6 -2 -4 9
 */
public class CountZeroSum {

    public static void main(String[] args) {
        int[] nums = {1, 5, -2, 3, 0, 6, -2, -4, 9};
        System.out.println(countZeroSumIntervals(nums));
    }

    public static int countZeroSumIntervals(int[] nums) {
        Map<Integer, Integer> prefixSum = new HashMap<>(); //<Сумма, Количество_таких_сумм>
        prefixSum.put(0, 1);
        //считаем обычные префиксные суммы
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (!prefixSum.containsKey(sum)) {
                prefixSum.put(sum, 0);
            }
            prefixSum.put(sum, prefixSum.get(sum) + 1);
        }
        //если в массиве префиксов есть одинаковые элементы (т.е. встречаются > 1 раза, то сумма на каком-то отрезке равна нулю
        //........=x
        //...............=x
        //          ^...^=0
        // количество отрезков = количество повторений - 1
        int ans = 0;
        for (Integer keySum : prefixSum.keySet()){
            if (prefixSum.get(keySum) > 1){
                ans += prefixSum.get(keySum) - 1;
            }
        }
        return ans;
    }
}
