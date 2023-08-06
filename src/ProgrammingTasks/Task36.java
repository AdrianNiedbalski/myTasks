package ProgrammingTasks;

import java.util.Scanner;

public class Task36 {
    public static void wave(int length, int height) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < length; col++) {
                for (int i = 0; i <= height; i++) {
                    if (i == row) {
                        System.out.print("*");
                    }
                    else if (i !=height && i != length) {
                        System.out.print(" ");
                    }
                }
                for (int j = height; j >= 0; j--) {
                    if (j == row) {
                        System.out.print("*");
                    }
                    else if (j !=height && j < height) {
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
        System.out.println("Podaj szerokosc: ");
        int length = scanner.nextInt();
        System.out.println("Podaj wysokosc: ");
        int height = scanner.nextInt();
        wave(length, height);
    }
}
