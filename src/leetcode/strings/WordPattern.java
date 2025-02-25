package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Specifically:
    Each letter in pattern maps to exactly one unique word in s.
    Each unique word in s maps to exactly one letter in pattern.
    No two letters map to the same word, and no two words map to the same letter.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Explanation:
The bijection can be established as:

    'a' maps to "dog".
    'b' maps to "cat".

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"

Output: false
 */
public class WordPattern {

    public static void main(String[] args) {
        String pattern = "aaa";
        String s = "dog cat dog";
        String s1 = "dog cat cat dog";
        String s2 = "dog cat cat fish";

        System.out.println(wordPattern(pattern, s));
//        System.out.println(wordPattern(pattern, s1));
//        System.out.println(wordPattern(pattern, s2));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        Map<Character, String> patternToWord = new HashMap<>();
        Map<String, Character> wordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];

            if (patternToWord.getOrDefault(p, w).equals(w) &&
                    wordToPattern.getOrDefault(w, p).equals(p)) {
                patternToWord.put(p, w);
                wordToPattern.put(w, p);
            } else {
                return false;
            }
        }
        return true;
    }
}
