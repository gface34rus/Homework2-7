package tasks;

import java.util.*;
public class Task4 {
    public static void countWordDuplicates(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println( entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        countWordDuplicates(strings);
    }
}
