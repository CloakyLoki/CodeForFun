package leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "dvdf";

        System.out.println(lengthOfLongestSubstring(s3));
    }

        public static int lengthOfLongestSubstring(String s) {
            int pointer = 0;
            int max = 0;
            Set<Character> substring= new HashSet<>();

            while (pointer < s.length()){
                var  current = s.charAt(pointer);
                if(!substring.contains(current)){
                    substring.add(current);
                    pointer++;
                } else {
                    pointer++;
                }
                max = Math.max(substring.size(), max);
            }
            return max;
        }
    }
