package leetcode.strings;
/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String tempPrefix = String.valueOf(strs[0].charAt(0));
        int counter = 1;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].startsWith(tempPrefix) && counter != strs.length - 1){
                counter++;

            } else {
                break;
  //              return tempPrefix;
            }
  //          if (counter)
        }

        return null;
    }
}