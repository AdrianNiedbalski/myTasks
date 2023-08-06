package ProgrammingTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static int getIntFromUser() {
        int number = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        do {
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

    public static ArrayList<Integer> makeList(int number) {
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Podaj liczby do listy: ");
        for (int i = 0; i < number; i++) {
            int num = getIntFromUser();
            numberList.add(num);
        }
        return numberList;
    }
    public static int findDifference (ArrayList<Integer> list) {
        int maxInt = 0;
        int minInt = 1;
        for (int num : list) {
            if (num > maxInt) {
                maxInt = num;
            }
            else if (num <= minInt) {
                minInt = num;
            }
        }
        return maxInt - minInt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int input = getIntFromUser();
        ArrayList<Integer> numberList = makeList(input);
        int result = findDifference(numberList);
        System.out.println(result);
    }
}
