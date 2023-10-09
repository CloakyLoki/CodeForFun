package yandex.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Дана строка S. Выведите гистограмму как в примере (коды символов отсортированы).
 * S = "Hello, world!"
 * <p>
 *      #
 *      ##
 * #########
 * !,Hdelorw
 */
public class PrintChart {
    public static void main(String[] args) {
        String s = "Hello, world!";
        printChart(s);
    }

    public static void printChart(String s) {
        Map<Character, Integer> countChars = new TreeMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (!countChars.containsKey(currentChar)) {
                countChars.put(currentChar, 0);
            }
            countChars.put(currentChar, countChars.get(currentChar) + 1);
            max = Math.max(countChars.get(currentChar), max);
        }
        for (int row = max; row >= 1; row--) {
            for (Character c : countChars.keySet()) {
                int number = countChars.get(c);
                if (number >= row) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (Character c : countChars.keySet()) System.out.print(c);
    }
}
