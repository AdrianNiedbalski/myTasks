package ProgrammingTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task20 {
    //There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
//
//For example, if N is 4, then there are 5 unique ways:
//
//1, 1, 1, 1
//2, 1, 1
//1, 2, 1
//1, 1, 2
//2, 2
//What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.
        public static int stairs(int N) {
            if (N < 2) {
                return 1;
            }
            ArrayList<Integer> results = new ArrayList<>();
            results.add(1);
            results.add(1);

            for (int i = 2; i <= N; i++) {
                int ways = results.get(i-1) + results.get(i-2);
                System.out.println(ways);
                results.add(ways);
            }
            return results.get(N);

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj wielkosc schodow: ");
            int N = scanner.nextInt();
            System.out.println(stairs(N));
        }
}
