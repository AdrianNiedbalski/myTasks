package ProgrammingTasks;

import java.util.Random;
import java.util.Scanner;

public class Task13gameBingo {
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
        return number;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int wylosowanaLiczba = random.nextInt(100) + 1;
        System.out.println("Zgadnij liczbę z zakresu od 1 do 100.");
        while(true) {
            int number = readNumberFromUser();

            if (number == wylosowanaLiczba) {
                System.out.println("Bingo!");
                break;
            }
            else if(number > wylosowanaLiczba) {
                System.out.println("Za duzo, proboj dalej!");
            }
            else {
                System.out.println("Za malo, porboj dalej!");
            }
        }
    }
}
