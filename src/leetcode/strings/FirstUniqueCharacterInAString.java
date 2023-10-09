package leetcode.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Input: s = "loveleetcode"
Output: 2
 */
public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        String s = "dddccdbba";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), i);
            } else {
                charMap.put(s.charAt(i), -1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() != -1) {
                return (int) entry.getValue();
            }
        }
        return -1;
    }

//    public int firstUniqChar(String s) {
//        int min = Integer.MAX_VALUE;
//        for (char c = 'a'; c <= 'z'; c++) {
//            int inx = s.indexOf(c);
//            if (inx != -1 && inx == s.lastIndexOf(c)) min = Math.min(min, inx);
//        }
//        return (min != Integer.MAX_VALUE) ? min : -1;
//    }
}
