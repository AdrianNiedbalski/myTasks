package ProgrammingTasks;

import java.util.Scanner;

public class Task27 {
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
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = readNumberFromUser();
        int result = sum(num);
        System.out.println(result);
    }
}
