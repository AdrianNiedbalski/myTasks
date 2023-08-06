package ProgrammingTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task14 {
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
    public static StringBuilder listToString (ArrayList<Integer> numberList) {
        StringBuilder sb = new StringBuilder();
        for (int number : numberList) {
            sb.append(number);
        }
        return sb;
    }
    public static boolean isPalindrome(StringBuilder sb) {
        for (int i = 0; i < sb.length()/2; i++) {
            int index = i;
            int lastIndex = sb.length() - 1 - i;
            if (sb.charAt(index) != sb.charAt(lastIndex)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int number = scanner.nextInt();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList = makeList(number);
        StringBuilder sb = listToString(numberList);
        boolean result = isPalindrome(sb);
        System.out.println(result);

    }
}
