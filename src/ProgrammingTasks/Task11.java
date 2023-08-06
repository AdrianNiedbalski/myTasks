package ProgrammingTasks;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int k = list.get(i);
            if (!uniqueList.contains(k)){
                uniqueList.add(k);
            }
        }
        return uniqueList;
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        List<Integer> uniqueList = findUnique(numbers);
        System.out.println(uniqueList);
    }
}
