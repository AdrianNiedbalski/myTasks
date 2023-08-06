package ProgrammingTasks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task31 {
    public static String readTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak: ");
        String sign = scanner.nextLine();
        return sign;
    }
    public static boolean isLatinLetter(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        if (text.length() == 1 && pattern.matcher(text).matches()) {
            return true;
        } else {
            System.out.println("Niepoprawna litera!");
            return false;
        }
    }
    public static char checkIfLatinLetter(String text) {
        do {
            if (isLatinLetter(text)) {
                return text.charAt(0);
            }
            text = readTextFromUser();
        } while(true);
    }
    public static int countCharactersBetween(char firstChar, char secondChar) {
        int firstCharCode = (int) firstChar;
        int secondCharCode = (int) secondChar;
        return Math.abs(secondCharCode - firstCharCode - 1);
    }
    public static void main(String[] args) {
        String firstLetter = readTextFromUser();
        char firstChar = checkIfLatinLetter(firstLetter);

        String secondLetter = readTextFromUser();
        char secondChar = checkIfLatinLetter(secondLetter);

        int count = countCharactersBetween(firstChar, secondChar);
        System.out.println("Liczba znakow pomiedzy podanymi literami: " + count);
    }
}
