package leetcode.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 * <p>
 * Example 1:
 * <p>
 * V
 * Input: s1 = "ab", s2 = "eidbaooo"
 * [[a=1], [b=1]]
 * a=1, b=0
 * a=0, b=0 ;len = 2 s1.length
 * <p>
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 * <p>
 * Example 2:
 * <p>
 * Input: s1 = "ab", s2 = "eidboaoo"
 * Output: false
 */

/*
//создать мапу строки s1
        //1. стартовым указателем найти первый встречающийся символ
        //2. двигать финишный указатель на длину строки s1 от стартового, проверяя посимвольно наличие нужных символов. Если есть - убираем из мапы
        //3. если finish-start = s1.len && map.isEmpty -> true
        //4. Если не дошли до нужно длины строки s1, двигаем старт на следующую от нее позицию и снова нчинаем прочесывать финишным
 */
public class PermutationOfStrings {

    public static void main(String[] args) {
        String s1 = "ddcc";
        String s2 = "acdddcccaa";
        String s3 = "eidbabooo";

        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> charCountingMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charCountingMap.put(c, charCountingMap.getOrDefault(c, 0) + 1);
        }

        int start = 0, end = 0;
        Map<Character, Integer> tempMap = new HashMap<>(charCountingMap);

        while (end < s2.length()) {
            char endChar = s2.charAt(end);

            if (tempMap.containsKey(endChar)) {
                tempMap.put(endChar, tempMap.get(endChar) - 1);
                while (tempMap.get(endChar) < 0) {
                    char startChar = s2.charAt(start);
                    tempMap.put(startChar, tempMap.get(startChar) + 1);
                    start++;
                }
                if (end - start + 1 == s1.length()) {
                    return true;
                }
            } else {
                start = end + 1;
                tempMap = new HashMap<>(charCountingMap);
            }
            end++;
        }
        return false;
    }
}
