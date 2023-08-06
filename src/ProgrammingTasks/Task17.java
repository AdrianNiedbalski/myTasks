package ProgrammingTasks;

import java.util.Scanner;

public class Task17 {
    public static int readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbe dodatnia: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("Podaj poprawna liczbe!");
            }
            number = scanner.nextInt();
        } while(number < 0);
        scanner.close();
        return number;
    }
    public static int potega(int number, int pow) {
        if (pow == 1) {
            return number;
        }
        int s = 0;
        while (pow >= 1) {
            s= number * number;
        }
        return s;
    }
    public static void main(String[] args) {
        int number = readNumberFromUser();
        int ilosc = readNumberFromUser();
        int result = potega(number,ilosc);
        System.out.println(result);
    }
}
