package leetcode.strings;

/*
Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
    If the group's length is 1, append the character to s.
    Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
Note that group lengths that are 10 or longer will be split into multiple characters in chars.
After you are done modifying the input array, return the new length of the array.
You must write an algorithm that uses only constant extra space.
 */

import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args) {
//        char[] chars = {'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'b', 'c', 'c'};
//        char[] chars1 = {'a'};
        char[] chars2 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'}; //неверно
//        System.out.println(compress(chars));
//        System.out.println(compress(chars1));
        System.out.println(compress(chars2));
    }


    public static int compress(char[] chars) {
        int left = 0;
        int right = 0;
        int count = 0;
        int position = 0;
        int ans = 0;

        while (position < chars.length && right < chars.length) {

            while (right < chars.length) {
                if (chars[right] == chars[left]) {
                    count++;
                    right++;
                } else {
                    break;
                }
            }
            chars[position++] = chars[left];
            ans++;
            if (count > 9) {
                for (int i = 0; i < String.valueOf(count).length(); ++position, i++) {
                    chars[position] = String.valueOf(count).charAt(i);
                    ans++;
                }
            } else if (count > 1){
                chars[position] = (char) (count + '0');
                ans++;
            }

            left = right;
            count = 0;
        }

        return ans;
    }
}
