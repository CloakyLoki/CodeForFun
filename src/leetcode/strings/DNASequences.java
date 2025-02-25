package leetcode.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

    For example, "ACGAATTCCG" is a DNA sequence.

When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.

Example 1:

Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
Output: ["AAAAACCCCC","CCCCCAAAAA"]

Example 2:

Input: s = "AAAAAAAAAAAAA"
Output: ["AAAAAAAAAA"]

 */
public class DNASequences {

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String s2 = "AAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s2));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) return new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int sequenceLength = 10;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i <= s.length() - sequenceLength; i++) {
            String current = s.substring(i, i + sequenceLength);
            if (map.containsKey(current)) {
                if (map.get(current) == 1) {
                    ans.add(current);
                    map.put(current, map.get(current) + 1);
                }
            } else {
                map.put(current, 1);
            }
        }
        return ans;
    }
}

