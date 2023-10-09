package yandex.sets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Дан словарь из N слов, длина каждого не превосходит K
 * В записи каждого из M слов текста (кждое длиной до K) может быть пропущена одна буква.
 * Для каждого слова сказать, входит ли оно (возможно, с одной пропущенной буквой) в словарь
 * https://www.youtube.com/live/PUpmV2ieIHA?si=oe9hSZbBT6Dji27f&t=3004
 *
 * O(NK^2-M)
 */
public class IsWordWithIncorrectChar {
    public static void main(String[] args) {
        String[] dict = {"abc", "dfg", "rrtyye"};
        String[] text = {"ac", "jjj"};

        var goodWords = new HashSet<>(Arrays.asList(dict));
        for (String word : dict){
            for (int i = 1; i < word.length(); i++) {
                goodWords.add(word.substring(0, i - 1) + word.substring(i));
            }
        }
        Map<String, Boolean> ans = new HashMap<>();
        for (String word : text){
            ans.put(word, goodWords.contains(word));
        }
        System.out.println(ans);
    }
}
