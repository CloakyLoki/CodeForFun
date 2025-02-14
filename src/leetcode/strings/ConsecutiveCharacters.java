package leetcode.strings;

/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.



Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

 */

public class ConsecutiveCharacters {

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "abbcccddddeeeeedcba";

        System.out.println(maxPower(s1));
    }

    public static int maxPower(String s) {
        int max = 1;
        int counterCurrent = 1;
        char charCurrent;
        char charPrevious;

        if(s.length() == 1) return 1;

        for (int i = 1; i < s.length(); i++){
            charCurrent = s.charAt(i);
            charPrevious = s.charAt(i -1);

            if (charCurrent == charPrevious){
                counterCurrent++;
                max = Math.max(counterCurrent, max);

            } else {
                counterCurrent = 1;
            }
        }
        return max;
    }
}
