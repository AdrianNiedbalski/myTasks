package ProgrammingTasks;

public class Task12 {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("Największy wspólny dzielnik dla " + a + " i " + b + ": " + findGCD(a, b));

        // Możesz przetestować funkcję dla innych liczb
    }
}
