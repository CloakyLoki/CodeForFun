package yandex.prefixsum;

/**
 * Дана последовательность чисел длиной N и M запросов.
 * Запросы: "Сколько нулей на полуинтервале [L, R]"
 * <p>
 * nums[]:   1 0 1 1 0 0 1
 * prefix[]: 0 0 1 1 1 2 3 3
 */
public class CountZeroes {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, 0, 0, 1};
        System.out.println(countZeroes(nums, 0, 5));

    }

    public static int countZeroes(int[] nums, int left, int right) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 1; i < prefix.length; i++) {
            if (nums[i - 1] == 0) { //если встречается 0, увеличиваем сумму на 1
                prefix[i] = prefix[i - 1] + 1;
            } else {                //иначе оставляем ее без изменений, просто перенося значение в следующую ячейку
                prefix[i] = prefix[i - 1];
            }
        }
        return prefix[right] - prefix[left];
    }


}
