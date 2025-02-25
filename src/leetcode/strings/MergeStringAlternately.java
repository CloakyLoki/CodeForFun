package leetcode.strings;

/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
 */
public class MergeStringAlternately {

    public static void main(String[] args) {
        String a = "a";
        String b = "pdddd";

        System.out.println(mergeAlternately(a, b));
    }

    public static String mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        int currentPos = 0;
        StringBuilder sb = new StringBuilder();

        while (currentPos < maxLength) {
            if (currentPos < word1.length()) {
                sb.append(word1.charAt(currentPos));
            }
            if (currentPos < word2.length()) {
                sb.append(word2.charAt(currentPos));
            }
            currentPos++;
        }
        return new String(sb);
    }
}
