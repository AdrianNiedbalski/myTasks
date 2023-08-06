package ProgrammingTasks;

import java.util.Scanner;

public class Task25 {
    public static float readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isValid = false;
        do {
            System.out.println("Podaj liczbe: ");
            if (scanner.hasNextFloat()) {
                number = scanner.nextFloat();
                isValid = true;
            } else {
                String input = scanner.next();
                System.out.println("To nie jest liczba!");
            }
        } while (!isValid);

        return number;
    }
    public static String readOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        String operator = null;
        boolean isValid = false;

        do {
            System.out.println("Podaj operator (+, -, *, /): ");
            operator = scanner.next();
            if(operator.length() == 1) {
                if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    isValid = true;
                } else {
                    System.out.println("Podales nieprawidlowy znak.");
                }
            }
        } while (!isValid);
        return operator;
    }
    public static float calculate(float numberOne, float numberTwo, String operator) {
        float result = 0.0f;
        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.println("Nie dzielimy przez 0!");
                } else {
                    result = numberOne / numberTwo;
                }
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        float numOne = readNumberFromUser();
        float numTwo = readNumberFromUser();
        String operationSign = readOperationFromUser();
        if (numTwo == 0 && operationSign.equals("/")) {
            System.out.println("Nie dzielimy przez 0!");
        } else {
            float result = calculate(numOne, numTwo, operationSign);
            System.out.println("Wynik: " + result);
        }
    }
}
