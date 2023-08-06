package ProgrammingTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task32 {
    public static int getIntFromUser() {
        int number = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe calkowita: ");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("To nie liczba calkowita!");
            }
        } while(!validInput);
        return number;
    }
    public static ArrayList<Integer> addingNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int number = getIntFromUser();
            numbers.add(number);
        }
        return numbers;
    }
    public static void countOccurences(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int number : numbers) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) +1);
        }
        System.out.println("Liczby, ktore wystapily dwukrotnie: ");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = addingNumbers();
        countOccurences(numbers);
    }
}
