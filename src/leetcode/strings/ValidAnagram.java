package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }

        for(Character c : t.toCharArray()){
            if(!sMap.containsKey(c) || sMap.get(c) == 0){
                return false;
            } else{
                sMap.put(c, sMap.get(c) - 1);
            }
        }
        return true;
    }
}
