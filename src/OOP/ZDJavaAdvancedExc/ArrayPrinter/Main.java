package OOP.ZDJavaAdvancedExc.ArrayPrinter;

import static OOP.ZDJavaAdvancedExc.ArrayPrinter.ArrayPrinter.printArray;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        Double[] doubleArray = {1.1,2.2,3.3};
        String[] stringArray = {"jeden", "dwa", "trzy"};

        System.out.println("Tablica liczb calkowitych: ");
        printArray(intArray);

        System.out.println("Tablica liczb zmiennoprzecinkowych: ");
        printArray(doubleArray);

        System.out.println("Tablica napisow: ");
        printArray(stringArray);

    }
}
