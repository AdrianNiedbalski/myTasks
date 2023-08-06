package ProgrammingTasks;

import java.util.ArrayList;
import java.util.List;

public class Task16 {
    public static List<Integer> findLongestArithmeticSubsequence(List<Integer> numbers) {
        List<Integer> currentList = new ArrayList<>();
        List<Integer> longest = new ArrayList<>();
        for(int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) - 1 == numbers.get(i - 1)) {
                if (currentList.isEmpty()) {
                    currentList.add(numbers.get(i - 1));
                }
                currentList.add(numbers.get(i));
            } else {
                if(currentList.size() > longest.size()) {
                    longest = new ArrayList<>(currentList);
                }
                currentList.clear();
            }
        }
        if (currentList.size() > longest.size()) {
            longest = new ArrayList<>(currentList);
        }
        return longest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);

        List<Integer> result = findLongestArithmeticSubsequence(numbers);
        System.out.println(result);
    }
}
