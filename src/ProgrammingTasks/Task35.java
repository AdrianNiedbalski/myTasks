package ProgrammingTasks;

import java.util.Scanner;

public class Task35 {
    public static void wave(int num) {
        for (int col = 0; col <= num; col++) { //wysokosc
            for (int i = 0 ; i < num ; i++) { //ilosc
                for (int row = 1; row <= num*2; row++) { //szerokosc
                    if (col == row || col == num*2 - row + 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc: ");
        int length = scanner.nextInt();
        wave(length);
    }
}
