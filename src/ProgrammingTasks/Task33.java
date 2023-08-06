package ProgrammingTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task33 {
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
    public static ArrayList<Integer> addToArray() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int number = getIntFromUser();
            numbers.add(number);
        }
        return numbers;
    }
    public static int longestSubs(ArrayList<Integer> numbers) {
        int maxLength = 1;
        int currLength = 1;
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) > numbers.get(i-1)) {
                currLength++;
            }
            else if (currLength > maxLength) {
                maxLength = currLength;
            } else {
                currLength = 1;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = addToArray();
        int longest = longestSubs(numbers);
        System.out.println("Najdluzszy podciag rosnacy: " + longest);
    }
}
