package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("один", "один", "два", "два", "три", "три", "четыре"));
        printUniqueWords(words);
    }
}
