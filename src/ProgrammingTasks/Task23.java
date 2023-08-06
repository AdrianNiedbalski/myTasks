package ProgrammingTasks;

import java.util.Scanner;

public class Task23 {
    public static int readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbe wieksza od 1: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("To nie jest liczba wieksza od 1!");
            }
            number = scanner.nextInt();
        } while (number < 0);
        scanner.close();
        return number;
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for(int i = 2; i*i <= number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = readNumberFromUser();
        if (isPrime(num)) {
            System.out.println("Liczba: " + num + " jest pierwsza.");
        } else {
            System.out.println("Liczba: " + num + " nie jest pierwsza.");
        }
    }
}
