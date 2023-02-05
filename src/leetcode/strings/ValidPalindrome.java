package leetcode.strings;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        boolean isPalindrome = true;
        String s = "0P";
        s = s.trim();
        s = s.toUpperCase();
        StringBuilder cleanString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                cleanString.append(s.charAt(i));
            }
        }
        for (int i = 0; i < cleanString.length(); i++) {
            if (cleanString.charAt(i) != cleanString.charAt(cleanString.length() - i - 1)) {
                isPalindrome = false;
            }
        }
        if (isPalindrome == false) {
            System.out.println("False");
        } else System.out.println("True");


    }
}