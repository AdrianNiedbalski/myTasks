package ProgrammingTasks;

import java.util.Scanner;

public class Task30 {
    public static String readTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        return scanner.nextLine();
    }
    public static String doubleWords(String text) {
        StringBuilder result = new StringBuilder();
        String[] tabWords = text.split("\s");
        for (String word : tabWords) {
            result.append(word).append(" ").append(word).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String text = readTextFromUser();
        String result = doubleWords(text);
        System.out.println("Podwojne slowa: " + result);
    }
}
