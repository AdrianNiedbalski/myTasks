package ProgrammingTasks;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static List<List<Integer>> findDivisiblePairs2(List<Integer> numbers, int k) {
        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                int num1 = numbers.get(i);
                int num2 = numbers.get(j);
                if ((num1 + num2) % k == 0) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(num1);
                    pair.add(num2);
                    myList.add(pair);
                }

            }
        }
        return myList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int k = 3;
        List<List<Integer>> result = findDivisiblePairs2(numbers, k);

        System.out.println("Pary liczb podzielnych przez " + k + ":");
        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }
}
