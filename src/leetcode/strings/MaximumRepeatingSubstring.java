package leetcode.strings;

public class MaximumRepeatingSubstring {

    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word1 = "aaaba";
        String word2 = "ba";
        String word3 = "ac";
        String word4 = "b";


        System.out.println(maxRepeating(sequence, word1));

    }

    public static int maxRepeating(String sequence, String word) {
        int left = 0, right = word.length();
        int count = 0;

        while(right <= sequence.length()) {
            String sub = sequence.substring(left, right);
            if (sub.equals(word)) {
                count++;
            }
                left++;
                right++;
        }
        return count;
    }
}
