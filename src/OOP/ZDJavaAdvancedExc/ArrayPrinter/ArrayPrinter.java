package OOP.ZDJavaAdvancedExc.ArrayPrinter;

public class ArrayPrinter {

    public static <T> void printArray(T[] Array) {
        for (T element : Array) {
            System.out.println(element);
        }
    }
}
