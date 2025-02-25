package leetcode.arrays;

import java.util.Set;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        String a = "aeO";
        System.out.println(reverseVowels(a));
    }

    private static String reverseVowels(String s) {
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] stringArray = s.toCharArray();

        int left = 0;
        int right = stringArray.length - 1;

        while (left < right) {
            if (!vowelSet.contains(stringArray[left])) {
                left++;
            } else if (!vowelSet.contains(stringArray[right])) {
                right--;
            } else {
                if (stringArray[left] != stringArray[right]) {
                    char temp = stringArray[left];
                    stringArray[left] = stringArray[right];
                    stringArray[right] = temp;
                }
                left++;
                right--;
            }
        }
        return new String(stringArray);
    }
}
