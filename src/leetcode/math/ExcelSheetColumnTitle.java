package leetcode.math;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 */
public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        int number = 28;
        System.out.println(convertToTitle(number));
    }

    public static String convertToTitle(int columnNumber) {
        Map<Integer, Character> alphabeth = new HashMap<>(26);
        Character ch = 'A';
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 26; i++) {
            alphabeth.put(i, ch++);
        }
// TODO: 03.02.2023 проверить условия. хуйня какая-то 
        while (true) {
            if (columnNumber / 26 >= 1) {
                if (columnNumber / 26 == 1) {
                    result.append(alphabeth.get(columnNumber));
                    break;
                }
                result.append(alphabeth.get(columnNumber % 26));
                columnNumber /= 26;
            } else {
                result.append(alphabeth.get(columnNumber));
                break;
            }
        }
        return result.reverse().toString();
    }
}
