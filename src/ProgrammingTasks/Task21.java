package ProgrammingTasks;

import java.util.ArrayList;
import java.util.List;

public class Task21 {
    public static List<Integer> swapAdjacentElements(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i+=2) {
            int temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);
        List<Integer> swappedList = swapAdjacentElements(list);
        System.out.println("Swapped list: " + swappedList);
    }
}
