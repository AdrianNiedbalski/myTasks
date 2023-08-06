package ProgrammingTasks;

import java.util.Scanner;

public class Task29 {
    public static String readTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        return scanner.nextLine();
    }

    public static double spacePercentage(String text) {
        int count = 0;
        for (char znak : text.toCharArray()) {
            if(znak == ' '){
                count ++;
            }
        }
        if (text.length() > 0) {
            return (double) count / text.length() * 100;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        String text = readTextFromUser();
        double percent = spacePercentage(text);
        System.out.println("Spacja wystepuje na: " + percent + " % znakow.");
    }
}
