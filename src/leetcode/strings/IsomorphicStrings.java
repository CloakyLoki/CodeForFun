package leetcode.strings;
/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving
the order of characters. No two characters may map to the same character, but a character may map to itself.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "egcd";
        String t = "adfd";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map map = new HashMap();
        for (int i = 0; i < s.length(); i++)
            //put вернет null, если ключ уже есть в таблице. И значение ключа, если его еще нет.
            if (!Objects.equals(map.put(s.charAt(i), i), map.put(t.charAt(i) + "", i))) return false;
        return true;
    }
}
