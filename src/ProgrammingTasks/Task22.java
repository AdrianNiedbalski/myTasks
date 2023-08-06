package ProgrammingTasks;

import java.util.Scanner;

public class Task22 {
    public static int readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Podaj liczbe dodatnia: ");
            while(!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("To nie jest liczba. Podaj liczbe dodatnia wieksza od 0.");
            }
            number = scanner.nextInt();
        } while (number <= 0);
        scanner.close();
        return number;
    }
    public static void pifpaf(int number) {
        for(int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf!");
            }
            else if (i % 3 == 0) {
                System.out.println("Pif!");
            }
            else if (i % 7 == 0) {
                System.out.println("Paf!");
            }
        }
    }
    public static void main(String[] args) {
        int num = readNumberFromUser();
        pifpaf(num);
    }
}
