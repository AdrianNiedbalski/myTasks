package ProgrammingTasks;

import java.util.Scanner;

public class Task7fibonacciReku {
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
    public static int fibbonaci(int number) {
        if (number <= 1) {
            return number;
        } else {
            return (fibbonaci(number - 2) + fibbonaci(number - 1));
        }
    }

    public static void main(String[] args) {
        int num = readNumberFromUser();
        int result = fibbonaci(num);
        System.out.println("Liczba fibonacciego o indeksie: " + num + " wynosi: " + result);
    }
}
