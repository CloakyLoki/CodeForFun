package leetcode.strings;

// TODO: 02.02.2023 check logic needed
/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FirstOccurrenceInAString {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "aabutsad";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        if (needle == null || needle.isEmpty() || needle.length() > haystack.length()) return -1;
        int subStringStartIndex = haystack.indexOf(needle.charAt(0));
        if (subStringStartIndex < 0) return subStringStartIndex;
        else {
            int k = 0;
            for (int i = subStringStartIndex; i < subStringStartIndex + needle.length() - 1; i++) {
                if (haystack.charAt(i) == needle.charAt(i - subStringStartIndex)) {
                    k++;
                } else {
                    subStringStartIndex = haystack.indexOf(needle.charAt(0), i);
                    k = 0;
                }
                if (k == needle.length() - 1) {
                    return subStringStartIndex;
                } else ;
            }
        }
        return -1;
    }
}