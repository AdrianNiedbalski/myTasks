package ProgrammingTasks;

import java.util.Scanner;

public class Task6fibonacci {
    public static int readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbe dodatnia: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("To nie jest liczba dodatnia!");
            }
            number = scanner.nextInt();
        } while (number < 0);

        scanner.close();
        return number;
    }
    public static int fibbonaci (int number) {
        if (number <= 1) {
            return number;
        }

        int fibMinus2 = 0;
        int fibMinus1 = 1;
        int fib = 0;

        for (int i = 2; i < number; i++) {
            fib = fibMinus2 + fibMinus1;
            fibMinus2 = fibMinus1;
            fibMinus1 = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        int num = readNumberFromUser();
        int result = fibbonaci(num);
        System.out.println("Liczba fibonacciego o indeksie: " + num + " wynosi: " + result);
    }
}
