package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void printUniqueEvenNumbers(List<Integer> nums) {
        Set<Integer> uniqueEvenNumbers = new TreeSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }

        for (Integer evenNum : uniqueEvenNumbers) {
            System.out.println(evenNum);
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printUniqueEvenNumbers(nums);
    }
}
