package leetcode.window;

import java.util.HashMap;
import java.util.Map;

/**
 * 1876. Substrings of Size Three with Distinct Characters
 * <p>
 * A string is good if there are no repeated characters.
 * Given a string s, return the number of good substrings of length three in s.
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 * A substring is a contiguous sequence of characters in a string.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "xyzzaz"
 * Output: 1
 * Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
 * The only good substring of length 3 is "xyz".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "aababcabc"
 * Output: 4
 * Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
 * The good substrings are "abc", "bca", "cab", and "abc".
 */
public class SubStringThreeDistinct {

    public static void main(String[] args) {
        String s = "aababcabc";

        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (end < s.length()) {
            if (!map.containsKey(s.charAt(end))) {

                map.put((s.charAt(end)), 1);
            } else {
                map.put(s.charAt(end), map.get(s.charAt(end)) + 1);
            }
            if (end - start + 1 < 3) {
                end++;
            } else {
                if (map.size() == 3) {
                    ans++;
                }
                if (map.containsKey(s.charAt(start))) {
                    map.put((s.charAt(start)), map.get(s.charAt(start)) - 1);
                    if (map.get(s.charAt(start)) == 0) {
                        map.remove(s.charAt(start));
                    }
                }
                start++;
                end++;
            }
        }
        return ans;
    }
}
