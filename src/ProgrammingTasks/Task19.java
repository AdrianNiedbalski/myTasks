package ProgrammingTasks;

import java.util.ArrayList;
import java.util.List;

public class Task19 {
    public static int mostNum(List<Integer> list) {
        int mostSum = 0;
        int mostNu = 0;
        for (int i = 0; i < list.size(); i++) {
            int currSum = 0;

            int test = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (test == list.get(j)) {
                    currSum++;
                }
            }
            if (currSum > mostSum) {
                mostSum = currSum;
                mostNu = test;
            }


        }
        return mostNu;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);
        int result = mostNum(numbers);
        System.out.println(result);
    }
}
