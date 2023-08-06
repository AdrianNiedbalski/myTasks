package ProgrammingTasks;

import java.util.Scanner;

public class Task28 {
    final static String ENTER_TEXT = "Podaj slowo: ";
    public static String readTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ENTER_TEXT + " (zeby przerwac wpisz 'starczy')");
        return scanner.nextLine();
    }
    public static String longestText(String text) {
        String longest = " ";
        while (!text.equalsIgnoreCase("Starczy")) {
            if(text.length() > longest.length()) {
                longest = text;
            }
            text = readTextFromUser();
        }
        return longest;
    }
    public static void main(String[] args) {
        String text = readTextFromUser();
        String result = longestText(text);
        System.out.println("Najdluzszy z podanych tekstow to: " + result);
    }
}
