package ProgrammingTasks;

import java.util.Scanner;

public class Task24 {
    public static int readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbe wieksza od 0: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.nextLine();
                System.out.println("To nie jest liczba wieksza od 0.");
            }
            number = scanner.nextInt();
        } while (number < 0);
        scanner.close();
        return number;
    }
    public static double szereg(int number) {
        double result = 0.0;
        for(float i = 1; i < number; i++) {
            result += 1.0 / i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = readNumberFromUser();
        double res = szereg(num);
        System.out.println("Suma szeregu harmonicznego: " + res);
    }
}
