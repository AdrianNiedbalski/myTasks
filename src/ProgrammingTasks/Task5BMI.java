package ProgrammingTasks;

import java.util.Scanner;

public class Task5BMI {
    static class GenderData {
        private double bmiCoefficient;
        public GenderData(double bmiCoefficient) {
            this.bmiCoefficient = bmiCoefficient;
        }

        public double getBmiCoefficient() {
            return bmiCoefficient;
        }
    }
    public static double calculateBMI(float weight, int height, GenderData genderData){
        double heightInMeters = height / 100.0;
        double bmiCoefficient = genderData.getBmiCoefficient();
        return (weight / (heightInMeters * heightInMeters)) * bmiCoefficient;
    }
    public static void optimalBMI (double bmi) {
        if(bmi > 24.9) {
            System.out.println("Masz nadwage.");
        }
        else if (bmi > 18.5) {
            System.out.println("Waga w normie.");
        }
        else {
            System.out.println("Jestes niedozywiony.");
        }
    }

    public static float readWeightFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja wage (w kilogramach): ");
        float weight = scanner.nextFloat();
        return weight;
    }
    public static int readHeightFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj swzrost (w centrymetrach): ");
        int height = scanner.nextInt();
        return height;
    }
    public static GenderData readGenderFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją płeć (M/K): ");
        String genderInput = scanner.nextLine();
        scanner.close();

        if (genderInput.equalsIgnoreCase("M")) {
            // Dane dla płci męskiej
            return new GenderData(1.0);
        } else if (genderInput.equalsIgnoreCase("K")) {
            // Dane dla płci żeńskiej
            return new GenderData(0.9);
        } else {
            // Domyślne dane dla nieznanej płci
            return new GenderData(1.0);
        }
    }

    public static void main(String[] args) {
        float weight = readWeightFromUser();
        int height = readHeightFromUser();
        GenderData genderData = readGenderFromUser();

        double bmi = calculateBMI(weight, height, genderData);
        System.out.println("Twój wskaźnik BMI wynosi: " + bmi);
        optimalBMI(bmi);
    }

}
