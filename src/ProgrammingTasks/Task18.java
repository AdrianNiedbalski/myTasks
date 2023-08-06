package ProgrammingTasks;

import java.util.ArrayList;
import java.util.List;

public class Task18 {
    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println(reverseList(list));
    }
}
