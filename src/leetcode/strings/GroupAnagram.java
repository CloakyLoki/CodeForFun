package leetcode.strings;

import java.util.*;
import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.toList;

public class GroupAnagram {
        public List<List<String>> groupAnagrams(String[] items) {
            Map<String, List<String>> map = new LinkedHashMap<>();
            for (String currentItem : items) {
                char[] currentCharArray = currentItem.toCharArray();
                Arrays.sort(currentCharArray);
                String mapKey = new String(currentCharArray);
                List<String> mapValue = map.computeIfAbsent(mapKey, k -> new ArrayList<>());
                mapValue.add(currentItem);
            }
            return map.values().stream()
                    .peek(list -> list.sort(naturalOrder()))
                    .collect(toList());
        }
    }
