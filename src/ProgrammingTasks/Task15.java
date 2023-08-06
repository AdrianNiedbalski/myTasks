package ProgrammingTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task15 {
    public static List<Integer> findPrimes(int number) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (isPrime2(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
    public static boolean isPrime2 (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int n = scanner.nextInt();
        System.out.println(findPrimes(n));
    }
}
