package ProgrammingTasks;

import java.util.Scanner;

public class Task26 {
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
    public static void wave(int num) {
        for(int col = 0; col < 4; col++){
            for(int waveNum = 0; waveNum < num; waveNum++){
                for(int row = 0; row < 8; row++){
                    if(row == col || col == 8 - row -1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = readNumberFromUser();
        wave(num);
    }
}
