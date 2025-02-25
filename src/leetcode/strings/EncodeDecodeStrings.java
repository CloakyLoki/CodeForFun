package leetcode.strings;

import java.util.LinkedList;
import java.util.List;

/*
Design an algorithm to encode a list of strings to a single string.
The encoded string is then decoded back to the original list of strings.
 */
public class EncodeDecodeStrings {

    public static void main(String[] args) {
        List<String> s = List.of("we","sssssssssssssssssay",":","yes","!@#$%^&*()");

        System.out.println(encode(s));
        System.out.println(decode(encode(s)));
    }

    public static String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();

        for (String word : strs) {
            ans.append(word.length());
            ans.append("#");
            ans.append(word);
        }
        return ans.toString();
    }

    public static List<String> decode(String str) {
        List<String> ans = new LinkedList<>();

        if (str == null || str.length() == 0) {
            return ans;
        }
        int currentIdx = 0;
        StringBuilder decodeKeySb = new StringBuilder();

        while (str.charAt(currentIdx) != '#'){
            decodeKeySb.append(str.charAt(currentIdx));
            currentIdx++;
        }

        int decodeKey = Integer.parseInt(decodeKeySb.toString());

        StringBuilder word = new StringBuilder();

        for (int i = 1; i < str.length() + 1; i++) {
            decodeKey--;
            if (decodeKey != 0) {
                word.append(str.charAt(i));
            } else {
                if (i < str.length()) {

                    while (str.charAt(currentIdx) != '#'){
                        decodeKeySb.append(str.charAt(currentIdx));
                        currentIdx++;
                    }

                    decodeKey = str.charAt(i) - '0' + 1;
                }
                ans.add(word.toString());
                word.setLength(0);
            }
        }
        return ans;
    }

}
