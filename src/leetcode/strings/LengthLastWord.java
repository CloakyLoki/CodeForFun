package leetcode.strings;
//Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.

public class LengthLastWord {

    public static void main(String[] args) {
    String s = "   fly me   to   the mo8on  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){

        String temp = new String (s.trim());
        int result = temp.substring(temp.lastIndexOf(' ') + 1).length();
        return result;

    }
}
