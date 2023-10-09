package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Input: ransomNote = "aa", magazine = "ab"
Output: false

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length() || ransomNote.length() == 0 || magazine.length() == 0) return false;
        Map<Character, Integer> chars = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++){
            if(chars.containsKey(magazine.charAt(i))){
                chars.put(magazine.charAt(i), chars.get(magazine.charAt(i)) + 1);
            } else{
                chars.put(magazine.charAt(i), 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            if(!chars.containsKey(ransomNote.charAt(i))) return false;
            else {
                if(chars.get(ransomNote.charAt(i)) > 1) {
                    chars.put(ransomNote.charAt(i), chars.get(ransomNote.charAt(i)) - 1);
                }
                else {
                    chars.remove(ransomNote.charAt(i));
                }
            }
        }
        return true;

    }
//        Map<String, Integer> magMap = new HashMap<>();
//        String pos;
//        if (ransomNote.equals("") || magazine.equals("")) return false;
//
//        for (int i = 0; i < magazine.length(); i++) {
//            pos = magazine.substring(i, i + 1);
//            if (magMap.containsKey(pos)) {
//                magMap.put(pos, magMap.get(pos) + 1);
//            } else {
//                magMap.put(pos, 1);
//            }
//        }
//        for (int i = 0; i < ransomNote.length(); i++) {
//            pos = ransomNote.substring(i, i + 1);
//            if (!magMap.containsKey(pos) || magMap.get(pos) == 0) {
//                break;
//            } else {
//                magMap.put(pos, magMap.get(pos) - 1);
//            }
//            if (i == ransomNote.length() - 1) return true;
//        }
//        return false;

//        if (ransomNote.length() > magazine.length()) return false;
//        int[] alphabets_counter = new int[26];
//
//        for (char c : magazine.toCharArray())
//            alphabets_counter[c-'a']++;
//
//        for (char c : ransomNote.toCharArray()){
//            if (alphabets_counter[c-'a'] == 0) return false;
//            alphabets_counter[c-'a']--;
//        }
//        return true;
//    }

}
