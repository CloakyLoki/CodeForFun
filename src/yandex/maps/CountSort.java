package yandex.maps;

import java.util.Arrays;

public class CountSort {
//Todo переписать сортировку подсчетом. Сейчас не работает
    public static void main(String[] args) {
        int[] grades = {5, 4, 5, 2, 3, 5, 4};
        int minVal = Arrays.stream(grades).min().orElseThrow();
        int maxVal = Arrays.stream(grades).max().orElseThrow();
        int k = maxVal - minVal + 1;
        int[] count = new int[k];

        for (int grade : grades){
            count[grade - minVal] += 1;
        }

        int[] ans = new int[grades.length];
        for (int i = grades.length - 1; i >= 0 ; i--) {
            int current = grades[i];
            ans[count[current] - 1] = current;
            count[current]--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
